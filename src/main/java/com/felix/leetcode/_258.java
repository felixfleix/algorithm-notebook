package com.felix.leetcode;

/**
 * 258. 各位相加
 *
 * @author felix
 */
public class _258 {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
