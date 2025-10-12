package com.felix.leetcode;

/**
 * 326. 3 的幂
 *
 * @author felix
 */
public class _326 {
    public boolean isPowerOfThree(int n) {
        while (n > 1) {
            int p = n % 3;
            if (p != 0) {
                return false;
            }
            n = n / 3;
        }
        return n == 1;
    }
}
