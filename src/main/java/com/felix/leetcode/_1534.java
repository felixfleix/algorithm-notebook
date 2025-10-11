package com.felix.leetcode;

/**
 * 1534. 统计好三元组
 *
 * @author felix
 */
public class _1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
