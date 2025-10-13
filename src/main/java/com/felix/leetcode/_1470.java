package com.felix.leetcode;

/**
 * 1470. 重新排列数组
 *
 * @author felix
 */
public class _1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n ; i++) {
            int k = n + i;
            result[index++] = nums[i];
            result[index++] = nums[k];
        }
        return result;
    }
}
