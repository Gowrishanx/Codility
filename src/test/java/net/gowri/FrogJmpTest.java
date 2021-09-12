package net.gowri;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class FrogJmpTest {

    @Test
    void numberOfJumps() {
        FrogJmp frog = new FrogJmp();
        assertThat("generic-1", frog.jumps(10, 85, 30), is(equalTo(3)));
        assertThat("generic-2", frog.jumps(10, 85, 25), is(equalTo(3)));
        assertThat("generic-3", frog.jumps(10, 86, 25), is(equalTo(4)));
        assertThat("generic-4", frog.jumps(10, 10, 25), is(equalTo(0)));
    }
}