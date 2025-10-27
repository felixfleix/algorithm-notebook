package com.felix.leetcode.slidingwindow.knownLength;


/**
 * 643. 子数组最大平均数 I
 */
public class _643 {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double average = -10001d;
        int len = nums.length;
        for (int i = 0;i< len;i++) {
            sum += nums[i];
            // 参与求取平均值的元素个数
            int left = (i + 1) - k;

            if (left < 0) {
                continue;
            } else if (left > 0) {
                sum -= nums[left-1];
            }

            double ave = (double) sum / k;

            if (ave > average) {
                average = ave;
            }
        }

        return average;
    }

    public static void main(String[] args) {
        _643 o = new _643();
        int[] nums = {-1};
        System.out.println(o.findMaxAverage(nums, 1));
    }

}
