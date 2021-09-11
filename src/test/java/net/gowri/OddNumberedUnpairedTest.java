package net.gowri;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class OddNumberedUnpairedTest {

    @Test
    void test_generic() {
        OddNumberedUnpaired unpaired = new OddNumberedUnpaired();
        assertThat("generic-1", unpaired.find(new int[]{9,3,9,3,9,7,9}), is(equalTo(7)));
        assertThat("generic-2", unpaired.find(new int[]{9,3,9,3,9,7,9,9,7}), is(equalTo(9)));
    }

    @Test
    void test_better() {
        OddNumberedUnpaired unpaired = new OddNumberedUnpaired();
        assertThat("better-2", unpaired.findBetter(new int[]{9,3,9,3,9,7,9}), is(equalTo(7)));
        assertThat("better-2", unpaired.findBetter(new int[]{9,3,9,3,9,7,9,9,7}), is(equalTo(9)));
    }

}