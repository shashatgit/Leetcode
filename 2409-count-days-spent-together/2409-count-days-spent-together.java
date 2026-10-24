class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthAA = (arriveAlice.charAt(0) - '0') * 10 + arriveAlice.charAt(1) - '0';
        int monthAL = (leaveAlice.charAt(0) - '0') * 10 + leaveAlice.charAt(1) - '0';
        int monthBA = (arriveBob.charAt(0) - '0') * 10 + arriveBob.charAt(1) - '0';
        int monthBL = (leaveBob.charAt(0) - '0') * 10 + leaveBob.charAt(1) - '0';
        int dayAA = (arriveAlice.charAt(3) - '0') * 10 + arriveAlice.charAt(4) - '0';
        int dayAL = (leaveAlice.charAt(3) - '0') * 10 + leaveAlice.charAt(4) - '0';
        int dayBA = (arriveBob.charAt(3) - '0') * 10 + arriveBob.charAt(4) - '0';
        int dayBL = (leaveBob.charAt(3) - '0') * 10 + leaveBob.charAt(4) - '0';

        int  aliceA = 0;
        for(int i = 0; i < monthAA-1; i++)
        {
            aliceA += days[i];
        }
        aliceA += dayAA;

        int  bobA = 0;
        for(int i = 0; i < monthBA-1; i++)
        {
            bobA += days[i];
        }
        bobA += dayBA;

        int  aliceL = 0;
        for(int i = 0; i < monthAL-1; i++)
        {
            aliceL += days[i];
        }
        aliceL += dayAL;

        int  bobL = 0;
        for(int i = 0; i < monthBL-1; i++)
        {
            bobL += days[i];
        }
        bobL += dayBL;

        int start = Math.max(aliceA, bobA);
        int end = Math.min(aliceL, bobL);

        return Math.max(0, end - start + 1);
    }
}