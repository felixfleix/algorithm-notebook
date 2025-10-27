package com.felix.leetcode.slidingwindow.knownLength;


/**
 * 1343. 大小为 K 且平均值大于等于阈值的子数组数目
 */
public class _1343 {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
            int left = (i + 1) - k;
            if (left < 0) {
                continue;
            } else if (left > 0) {
                sum-=arr[left - 1];
            }

            double average = (double) sum / k;

            if (average >= threshold) {
                count++;
            }
        }
        return count;
    }

}
