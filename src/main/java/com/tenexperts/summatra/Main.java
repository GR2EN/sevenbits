package com.tenexperts.summatra;

import com.tenexperts.summatra.exceptions.ArraySummaterException;

import java.util.Arrays;

/**
 * @author almaz
 */
public class Main {

    /**
     * Default constructor
     */
    Main() {}

    /**
     * Demonstration of pair summater
     * @param args console arguments
     */
    public static void main(final String[] args) {
        IArraySummater summater = new PairSummater();
        int[] data = { 50, 50, 10, 10 };
        try {
            System.out.println("Maximum sum of " + Arrays.toString(data) + " equal = " + summater.sum(data));
        } catch (ArraySummaterException e) {
            System.err.println("ArraySummaterException: " + e.getMessage());
        }
    }

}
