package net.gowri;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class FrogRiverOneTest {

    @Test
    void sample_test() {
        FrogRiverOne frog = new FrogRiverOne();
        assertThat("generic-1", frog.jumps(5,new int[]{1,3,1,4,2,3,5,4}), is(equalTo(6)));
        assertThat("generic-2", frog.jumps(5,new int[]{1,3,1,4,2,3,4,5}), is(equalTo(7)));
        assertThat("generic-3", frog.jumps(5,new int[]{1,3,1,4,2,3,4,3}), is(equalTo(-1)));
        assertThat("generic-4", frog.jumps(5,new int[]{1,3,1}), is(equalTo(-1)));
        assertThat("generic-5", frog.jumps(5,new int[]{1,3,1,5}), is(equalTo(-1)));
        assertThat("generic-5", frog.jumps(5,new int[]{1,3,1,5,4}), is(equalTo(-1)));
        assertThat("generic-5", frog.jumps(5,new int[]{1,3,2,5,4}), is(equalTo(4)));
        assertThat("generic-6", frog.jumps(1,new int[]{1}), is(equalTo(0)));
    }
}