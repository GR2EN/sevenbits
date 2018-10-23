package com.tenexperts.summatra;

import com.tenexperts.summatra.exceptions.ArraySummaterException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class SimpleSummaterTest {

    private IArraySummater summater;

    @Before
    public void init() {
        summater = new SimpleSummater();
    }

    @Test
    public void testSumWithValidData() {
        int[] data0 = { 5, 10, 7, 2 };
        int[] data1 = { -5, 10, 7, 2 };
        int[] data2 = { 5, 10, 7 };
        int[] data3 = { 5 };
        int expected0 = 24;
        int expected1 = 14;
        int expected2 = 22;
        int expected3 = 5;
        try {
            assertEquals(expected0, summater.sum(data0));
            assertEquals(expected1, summater.sum(data1));
            assertEquals(expected2, summater.sum(data2));
            assertEquals(expected3, summater.sum(data3));
        } catch (ArraySummaterException e) {
            System.err.println("ArraySummaterException: " + e.getMessage());
        }
    }

    @Test
    public void testExceptionMessage() {
        int[] data = {};
        try {
            summater.sum(data);
            fail("Expected an ArraySummaterException to be thrown");
        } catch (ArraySummaterException e) {
            assertThat(e.getMessage(), is("Array can't be empty!"));
        }
    }

}