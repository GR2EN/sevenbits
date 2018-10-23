package com.tenexperts.summatra;

import com.tenexperts.summatra.exceptions.ArraySummaterException;

/**
 * If an empty array parameter is passed to method, then a
 * <tt>ArraySummaterException</tt> will be thrown
 */
public class SimpleSummater implements IArraySummater {

    /**
     * Count sum of array elements
     * @param data array of integers
     * @return sum of array elements
     * @throws ArraySummaterException if data is empty
     */
    public int sum(final int[] data) throws ArraySummaterException {
        if (data.length == 0) {
            // throw if data is empty
            throw new ArraySummaterException("Array can't be empty!");
        } else {
            int result = 0;

            for (int num : data) {
                result += num;
            }

            return result;
        }
    }

}
