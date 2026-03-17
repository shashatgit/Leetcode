class LRUCache {
    Node left, right;
    HashMap<Integer, Node> cache;   
    public void remove(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void add(Node node)
    {
        Node last = right.prev;
        last.next = node;
        node.prev = last;
        node.next = right;
        right.prev = node;
    } 
    public class Node{
        int key;
        int value;
        Node prev = null;
        Node next = null;

        public Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        } 
    }
    int max = 0;
    public LRUCache(int capacity) {
        this.max = capacity;
        left = new Node(-1, -1);
        right = new Node(-1, -1);
        left.next = right;
        right.prev = left;      
        cache = new HashMap<>();
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        Node tomove = cache.get(key);
        remove(tomove);
        add(tomove);
        cache.put(key, tomove);    
        return tomove.value;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
            cache.remove(key);
        }
        Node newN = new Node(key, value);
        add(newN);
        cache.put(key, newN);

        if (cache.size() > max) {
            Node lru = left.next;       
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */