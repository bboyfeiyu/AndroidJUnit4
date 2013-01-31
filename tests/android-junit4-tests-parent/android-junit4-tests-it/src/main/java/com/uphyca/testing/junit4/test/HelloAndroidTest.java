package com.uphyca.testing.junit4.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.uphyca.testing.AndroidJUnit4TestAdapter;
import com.uphyca.testing.AndroidTestCase;

public class HelloAndroidTest extends AndroidTestCase {

    /**
     * For Eclipse with ADT
     */
    public static junit.framework.Test suite() {
        //Should use AndroidJUnit4TestAdapter for to running AndroidDependent TestCases.
        return new AndroidJUnit4TestAdapter(HelloAndroidTest.class);
    }

    @Test
    public void testPreconditions() {
        assertNotNull(getContext());
    }

    @Test
    public void shouldBeValidPackage() {
        assertThat(getContext().getPackageName(), equalTo("com.uphyca.testing.junit4"));
    }

}
