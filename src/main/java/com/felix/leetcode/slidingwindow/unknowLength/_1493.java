package com.felix.leetcode.slidingwindow.unknowLength;

/**
 * 1493. 删掉一个元素以后全为 1 的最长子数组
 */
public class _1493 {

    public int longestSubarray(int[] nums) {
        int len = nums.length;
        int currentMaxLen = 0;
        int maxLen = 0;
        int zeroCount = 0;
        int lastZeroIndex = -1;
        for (int i = 0;i < len;i++) {
            if (nums[i] != 0) {
                currentMaxLen++;
            } else {
                if (zeroCount == 0) {
                    lastZeroIndex = i;
                }
                zeroCount++;
                if (zeroCount > 1) {
                    currentMaxLen = (i + 1) - (lastZeroIndex + 1);
                    zeroCount--;
                    lastZeroIndex = i;
                } else {
                    currentMaxLen++;
                }
            }

            if (currentMaxLen > maxLen) {
                maxLen = currentMaxLen;
            }
        }

        return maxLen - 1;
    }

}
