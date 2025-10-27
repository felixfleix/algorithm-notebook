package com.felix.leetcode.slidingwindow.knownLength;

import java.util.*;

/**
 * 2461. 长度为 K 子数组中的最大和
 */
public class _2461 {

    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxSum = Integer.MIN_VALUE;
        int len = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < len ;i ++) {
            sum += nums[i];

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            set.add(nums[i]);

            int left = (i + 1) - k;
            if (left < 0) {
                continue;
            } else if (left > 0) {
                sum -= nums[left - 1];
                int count = map.get(nums[left - 1]);
                map.put(nums[left - 1], --count);
                if (count == 0) {
                    set.remove(nums[left - 1]);
                }
            }

            if (sum > maxSum) {
                // boolean flag = true;
                // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                //     if (entry.getValue() > 1) {
                //         flag = false;
                //         break;
                //     }
                // }
                if (set.size() == k) {
                    maxSum = sum;
                }
            }
        }

        return maxSum == Integer.MIN_VALUE ? 0 : maxSum;
    }

}
