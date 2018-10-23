package com.tenexperts.summatra.exceptions;

/**
 * Throws in ArraySummater implementations
 */
public class ArraySummaterException extends Exception {

    /**
     * Default constructor
     */
    public ArraySummaterException() {
        super();
    }

    /**
     *
     * @param message - exception message
     */
    public ArraySummaterException(final String message) {
        super(message);
    }

}
