package com.tenexperts.summatra;

import com.tenexperts.summatra.exceptions.ArraySummaterException;

/**
 * If an empty array parameter is passed to method, then a
 * <tt>ArraySummaterException</tt> will be thrown
 */
public class PairSummater implements IArraySummater {

    /**
     * Count sum of paired array elements
     * @param data array of integers
     * @return maximum sum of paired array elements
     * @exception  ArraySummaterException if data is empty
     * @exception  ArraySummaterException if data contain odd amount of elements
     */
    public int sum(final int[] data) throws ArraySummaterException {
        if (data.length == 0) {
            // throw if data is empty
            throw new ArraySummaterException("Array can't be empty!");
        } else if (data.length % 2 == 1) {
            // throw if data contain odd amount elements
            throw new ArraySummaterException("Array can't contain odd amount of num!");
        } else {
            int maxSum = 0;
            int currentSum;

            // iterations even elements excluding last
            for (int i = 0; i < data.length - 1; i += 2) {
                // Counting sum of pairs
                currentSum = data[i] + data[i + 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }

            return maxSum;
        }
    }

}
