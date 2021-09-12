package net.gowri;

public class PermMissingElem {
    public int findMissing(int[] ints) {
        int[] visited = new int[ints.length + 1];
        for (int j : ints) {
            visited[j - 1] = 1;
        }
        int missing = 0;
        boolean found = false;
        for (int i = 0; (i < visited.length && !found); i++) {
            if (visited[i] == 0) {
                missing = i + 1;
                found = true;
            }
        }
        return missing;
    }
}
