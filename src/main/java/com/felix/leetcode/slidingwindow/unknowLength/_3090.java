package com.felix.leetcode.slidingwindow.unknowLength;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 3090. 每个字符最多出现两次的最长子字符串
 */
public class _3090 {

    public int maximumLengthSubstring(String s) {
        int len = s.length();
        int maxLen = 0;
        int tempMaxLen = 0;

        Map<Character, Integer> countMap = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0;i < len;i++) {
            char ch = s.charAt(i);
            queue.add(ch);
            int count = countMap.getOrDefault(ch, 0);
            if (count < 2) {
                countMap.put(ch, ++count);
            } else {
                while(queue.peek() != ch) {
                    char g = queue.poll();
                    countMap.put(g, countMap.get(g) - 1);
                }
                queue.poll();
            }

            if (queue.size() > maxLen) {
                maxLen = queue.size();
            }
        }

        return maxLen;
    }

}
