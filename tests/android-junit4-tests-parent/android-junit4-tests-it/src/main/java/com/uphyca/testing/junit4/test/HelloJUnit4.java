package com.uphyca.testing.junit4.test;

import static org.junit.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;

import org.junit.Test;

public class HelloJUnit4 {

    /**
     * For Eclipse with ADT
     */
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(HelloJUnit4.class);
    }

    @Test
    public void helloJUnit4() {
        assertTrue(true);
    }
}
