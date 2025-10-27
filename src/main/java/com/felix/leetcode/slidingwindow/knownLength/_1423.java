package com.felix.leetcode.slidingwindow.knownLength;


/**
 * 1423. 可获得的最大点数
 */
public class _1423 {

    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int n = len - k;

        int sum = 0;
        for (int i = 0;i < len;i++) {
            sum += cardPoints[i];
        }
        if (n <= 0) {
            return sum;
        }

        int sum2 = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < len;i++) {
            sum2 += cardPoints[i];

            int left = (i + 1) - n;

            if (left < 0) {
                continue;
            } else if (left > 0) {
                sum2 -= cardPoints[left - 1];
            }

            if (sum2 < minSum) {
                minSum = sum2;
            }
        }
        return sum - minSum;
    }

    public static void main(String[] args) {
        _1423 o = new _1423();
        int i = o.maxScore(new int[]{100, 40, 17, 9, 73, 75}, 3);
        System.out.println(i);
    }

}
