package net.gowri;

public class FrogJmp {
    public int jumps(int start, int end, int leap) {
        int distance = end - start;
        if (distance == 0) {
            return 0;
        }
        int jumps = distance / leap;
        if (distance % leap == 0) {
            return jumps;
        } else {
            return jumps + 1;
        }

    }
}
