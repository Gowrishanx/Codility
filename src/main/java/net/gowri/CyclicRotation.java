package net.gowri;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        int L = findRotations(A.length, K);

        if (L == 0) {
            return A;
        }

        return rotate(A, L);

    }

    private int[] rotate(int[] a, int l) {
        /*
           if i+l < length
             b[i+l] = a[i]
           else
             b[i+l-length] =a[i]

             {3,8,9,7,6}
             {9,7,6,3,8}
             length = 5
             l=3
             i=0
             b[3]=a[0]
             i=2 , 5, 0
             b[0]=a[2]
             i=3, 6, 1


         */

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if ((i + l) < a.length) {
                b[i + l] = a[i];
            } else {
                b[(i + l - a.length)] = a[i];
            }
        }
        return b;
    }

    private int findRotations(int length, int k) {
        if (length == 0 || k == 0) {
            return 0;
        }
        if (k < length) {
            return k;
        }
        return k % length;
    }

}
