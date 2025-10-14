package com.felix.leetcode;

/**
 * 1422. 分割字符串的最大得分
 *
 * @author felix
 */
public class _1422 {
    public int maxScore(String s) {
        int totalNumOfOne = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalNumOfOne++;
            }
        }

        int max = -1;
        int left = 0;
        int right = totalNumOfOne;

        for (int i = 1; i <= s.length() - 1; i++) {
            char first = s.charAt(i - 1);
            if (first == '0') {
                left++;
            } else if (first == '1') {
                right--;
            }
            if (left + right > max) {
                max = left + right;
            }
        }
        return max;
    }
}
