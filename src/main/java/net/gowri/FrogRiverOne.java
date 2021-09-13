package net.gowri;

public class FrogRiverOne {
    public int jumps(int X, int[] A) {

        if (A.length < X) {
            return -1;
        }
        int[] counter = new int[X + 1];
        int totalFoundSoFar = 0;
        int solution = -1;
        for (int i = 0; i < A.length; i++) {

            if (counter[A[i]] == 0) {
                totalFoundSoFar++;
                counter[A[i]] = 1;
            }

            if (totalFoundSoFar == X) {
                solution = i;
                break;
            }
        }
        return solution;

    }
}
