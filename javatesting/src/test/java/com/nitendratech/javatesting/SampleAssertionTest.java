package com.nitendratech.javatesting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by @author nitendratech on 8/20/20
 */
public class SampleAssertionTest {

    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();
        assertArrayEquals("Failure - byte arrays not same", expected, actual);
    }

    @Test
    public void testAssertEquals() {
        assertEquals("Failure - strings are not equal", "text", "text");
        //Checks that two primitives/objects are equal.
    }

    @Test
    public void testAssertFalse() {
        assertFalse("failure - should be false", false);
        //Checks that a condition is false.
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull("should not be null", new Object());
        //Checks that an object isn't null.
    }

    @Test
    public void testAssertNotSame() {
        assertNotSame("should not be same Object", new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull("should be null", null);
        //Checks that an object is null.
    }

    @Test
    public void testAssertSame() {
        assertSame("should be same", 62, Integer.valueOf(62));
    }

    @Test
    public void testAssertTrue() {
        assertTrue("failure - should be true", true);
        //Checks that a condition is true.
    }
}