package com.felix.leetcode;

/**
 * 1281. 整数的各位积和之差
 *
 * @author felix
 */
public class _1281 {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}
