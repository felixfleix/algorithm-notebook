package com.felix.leetcode;

/**
 * @author felix
 */
public class _1991 {

    public int findMiddleIndex(int[] nums) {
        int total = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            total += nums[i];
        }

        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] + sum * 2 == total) {
                return i;
            }
            sum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        _1991 demo = new _1991();
        int[] nums = {2, 3, -1, 8, 4};
        int middleIndex = demo.findMiddleIndex(nums);
        System.out.println(middleIndex);
    }

}
