package net.gowri;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BinaryGapTest {

    @Test
    void moreThanOneBinaryGap(){
        BinaryGap binaryGap = new BinaryGap();
        assertThat("expected max Gap", binaryGap.solution(9), is(2));
        assertThat("expected max Gap", binaryGap.solution(529), is(4));
        assertThat("expected max Gap", binaryGap.solution(32), is(0));
    }
}