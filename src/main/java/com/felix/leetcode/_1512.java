package com.felix.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1512. 好数对的数目
 *
 * @author felix
 */
public class _1512 {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }

    public int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result += (entry.getValue() - 1) * entry.getValue() / 2;
            }
        }

        return result;
    }
}
