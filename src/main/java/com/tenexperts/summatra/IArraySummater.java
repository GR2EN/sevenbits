package com.tenexperts.summatra;

import com.tenexperts.summatra.exceptions.ArraySummaterException;

/**
 * If an empty array parameter is passed to method, then a
 * <tt>ArraySummaterException</tt> will be thrown
 */
public interface IArraySummater {

    /**
     * Description may differ for individual implementation
     * @param data contain integer numbers
     * @return sum of data
     * @throws   ArraySummaterException if data is empty
     */
    int sum(int[] data) throws ArraySummaterException;

}
