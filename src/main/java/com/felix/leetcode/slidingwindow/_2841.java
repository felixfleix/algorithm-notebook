package com.felix.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2841 {

    public long maxSum(List<Integer> nums, int m, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0L;
        long maxSum = 0L;
        int len = nums.size();

        for (int i = 0; i < len; i++) {
            int e = nums.get(i);
            sum += e;

            map.put(e, map.getOrDefault(e, 0) + 1);

            int left = (i + 1) - k;
            if (left < 0) {
                continue;
            } else if (left > 0) {
                int e2 = nums.get(left - 1);
                sum -= e2;
                int count = map.get(e2) - 1;
                if (count == 0) {
                    map.remove(e2);
                } else {
                    map.put(e2, map.get(e2) - 1);
                }
            }

            if (sum > maxSum) {
                if (map.size() >= m) {
                    maxSum = sum;
                }

            }

        }

        return maxSum;
    }

}
