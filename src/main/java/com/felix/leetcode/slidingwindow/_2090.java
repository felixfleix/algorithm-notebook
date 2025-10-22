package com.felix.leetcode.slidingwindow;

/**
 * 2090.
 */
public class _2090 {

    // 需要注意，窗口内元素个数为 2 * k + 1，直径加上圆心
    public int[] getAverages(int[] nums, int k) {
        // 防止内存溢出，产生无法预知的结果
        long sum = 0;
        int len = nums.length;
        int[] result = new int[len];
        int radius = -1;

        for (int i = 0;i < len;i++) {
            sum+=nums[i];

            int left = (i + 1) - 2 * k - 1;
            if (left < 0) {
                result[i] = -1;
                continue;
            } else if (left > 0) {
                sum -= nums[left - 1];
            }

            int average = (int) (sum / (2 * k + 1));

            // 计算圆心索引位置
            radius = i + 1 - k - 1;
            result[radius] = average;
        }

        for (int i = radius + 1; i < len ; i++) {
            result[i] = -1;
        }

        return result;

    }

}
