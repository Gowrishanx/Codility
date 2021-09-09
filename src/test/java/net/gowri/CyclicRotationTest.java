package net.gowri;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    void rotate(){
        CyclicRotation rotator = new CyclicRotation();
        int[] solution = rotator.solution(new int[]{3, 8, 9, 7, 6}, 3);
        assertThat("sample",solution, is(equalTo(new int[]{9,7,6,3,8})));

        solution = rotator.solution(new int[]{},0);
        assertThat("empty",solution, is(equalTo(new int[]{})));

        solution = rotator.solution(new int[]{3, 8, 9, 7, 6}, 6);
        assertThat("rotate by 1, as k is 6 and l is 5",solution, is(equalTo(new int[]{6,3,8,9,7})));

        solution = rotator.solution(new int[]{3, 8, 9, 7, 6}, 5);
        assertThat("rotate by none, as k is 5 and l is 5",solution, is(equalTo(new int[]{3,8,9,7,6})));

    }
}