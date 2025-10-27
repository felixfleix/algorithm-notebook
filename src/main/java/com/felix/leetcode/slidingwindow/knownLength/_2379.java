package com.felix.leetcode.slidingwindow.knownLength;

/**
 * 2379. 得到 K 个黑块的最少涂色次数
 */
public class _2379 {

    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int minCount = Integer.MAX_VALUE;
        int len = blocks.length();
        for (int i = 0; i < len; i++) {
            if ('W' == blocks.charAt(i)) {
                count++;
            }

            int left = (i + 1) - k;
            if (left < 0) {
                continue;
            } else if (left > 0) {
                if ('W' == blocks.charAt(left - 1)) {
                    count--;
                }
            }

            if (minCount > count) {
                minCount = count;
            }
        }

        return minCount;
    }

    public static void main(String[] args) {
        _2379 o = new _2379();
        System.out.println(o.minimumRecolors("WBWBBBW",2));
    }

}
