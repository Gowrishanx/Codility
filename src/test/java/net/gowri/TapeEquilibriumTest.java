package net.gowri;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class TapeEquilibriumTest {

    @Test
    void minimalAbsoluteDifference() {
        TapeEquilibrium equilibrium = new TapeEquilibrium();
        assertThat("generic-1", equilibrium.minDiff(new int[]{3, 1, 2, 4, 3}), is(equalTo(1)));
        assertThat("generic-2", equilibrium.minDiff(new int[]{3, -1, 2, -7, 3}), is(equalTo(4)));
        assertThat("generic-2", equilibrium.minDiff(new int[]{3, -1, -2, 7, -3}), is(equalTo(0)));
        assertThat("generic-3", equilibrium.minDiff(new int[]{3, 2}), is(equalTo(1)));
        assertThat("generic-4", equilibrium.minDiff(new int[]{3, -3}), is(equalTo(6)));
        assertThat("generic-5", equilibrium.minDiff(new int[]{0, 2000}), is(equalTo(2000)));
        assertThat("generic-6", equilibrium.minDiff(new int[]{-1000, 3000}), is(equalTo(4000)));
        assertThat("generic-7", equilibrium.minDiff(new int[]{-1000, -3000}), is(equalTo(2000)));
        assertThat("generic-8", equilibrium.minDiff(new int[]{-2000, 2000}), is(equalTo(4000)));
        assertThat("generic-9", equilibrium.minDiff(new int[]{-3, 3}), is(equalTo(6)));

    }

}