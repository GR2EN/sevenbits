package com.tenexperts.summatra;

import com.tenexperts.summatra.exceptions.ArraySummaterException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class PairSummaterTest {

    private IArraySummater summater;

    @Before
    public void init() {
        summater = new PairSummater();
    }

    @Test
    public void testSumWithValidData() {
        int[] data0 = { 20, 10, 15, 1 };
        int[] data1 = { 20, 10, 15, 20, 30, 1 };
        int[] data2 = { 20, 10, 15, 20, 30, 10 };
        int expected0 = 30;
        int expected1 = 35;
        int expected2 = 40;
        try {
            assertEquals(expected0, summater.sum(data0));
            assertEquals(expected1, summater.sum(data1));
            assertEquals(expected2, summater.sum(data2));
        } catch (ArraySummaterException e) {
            System.err.println("ArraySummaterException: " + e.getMessage());
        }
    }

    @Test
    public void testSumExceptionMessageWithNotValidData() {
        int[] data = {7, 7, 7, 7, 7};
        try {
            summater.sum(data);
            fail("Expected an ArraySummaterException to be thrown");
        } catch (ArraySummaterException e) {
            assertThat(e.getMessage(), is("Array can't contain odd amount of num!"));
        }
    }

    @Test
    public void testSumExceptionMessageWithEmptyData() {
        int[] data = {};
        try {
            summater.sum(data);
            fail("Expected an ArraySummaterException to be thrown");
        } catch (ArraySummaterException e) {
            assertThat(e.getMessage(), is("Array can't be empty!"));
        }
    }

}