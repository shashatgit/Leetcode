class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12) hour = 0;
        double angH = (hour * 30) + ((double)minutes/2);
        double angM = minutes*6;
        return Math.min(360 - Math.abs(angH - angM),Math.abs(angH - angM));
    }
}