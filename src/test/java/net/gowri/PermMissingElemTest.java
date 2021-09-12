package net.gowri;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class PermMissingElemTest {

    @Test
    void missingNumber() {
        PermMissingElem detector = new PermMissingElem();
        assertThat("generic-1", detector.findMissing(new int[]{2, 3, 1, 5}), is(equalTo(4)));
        assertThat("generic-2", detector.findMissing(new int[]{2, 3, 4, 5}), is(equalTo(1)));

    }
}