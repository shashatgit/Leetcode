class Solution {
    int count = 0;
    public void divide (int num) {
        if(num == 1){
            count++;
            return;
        }
        else if(num % 2 == 0) {
            count++;
            divide(num/2);
        }
        else{
            count++;
            divide(num - 1);
        }
    }
    public int numberOfSteps(int num) {
        divide(num);
        return count;
    }
}