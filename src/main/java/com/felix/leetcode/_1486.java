package com.felix.leetcode;

/**
 * 1486. 数组异或操作
 *
 * @author felix
 */
public class _1486 {
    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^= start + 2 * i;
        }
        return result;
    }
}
