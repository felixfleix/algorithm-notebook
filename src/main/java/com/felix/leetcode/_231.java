package com.felix.leetcode;

/**
 * 231. 2 的幂
 *
 * @author felix
 */
public class _231 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        return (n >> 1 & (n - 1)) == (n >> 1);
    }
}
