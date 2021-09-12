package net.gowri;

public class TapeEquilibrium {
    public int minDiff(int[] ints) {
        int[] tally = new int[ints.length];

        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            counter = counter + ints[i];
            tally[i] = counter;
        }

        int minDiff = Integer.MAX_VALUE;
        int temp = 0;
        int total = tally[tally.length - 1];

        for (int i = 0; i < tally.length - 1; i++) {
            temp = Math.abs(tally[i] - (total - tally[i]));
            if (minDiff > temp) {
                minDiff = temp;
            }
        }
        return minDiff;
    }
}
