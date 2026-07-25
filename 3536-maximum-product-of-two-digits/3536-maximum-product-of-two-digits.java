class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        while(n > 0)
        {
            maxHeap.add(n % 10);
            n = n/10;
        }
        return maxHeap.poll()*maxHeap.poll();
    }
}