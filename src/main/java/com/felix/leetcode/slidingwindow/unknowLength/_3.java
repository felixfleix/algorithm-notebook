package com.felix.leetcode.slidingwindow.unknowLength;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 3. 无重复字符的最长子串
 */
public class _3 {

    public int lengthOfLongestSubstring(String s) {
        int head = 0;
        int len = s.length();

        int maxLen = 0;

        Map<Character, Integer> charToIndexMap = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (int tail = 0;tail < len; tail ++) {
            char ch = s.charAt(tail);
            Integer index = charToIndexMap.get(ch);
            queue.add(ch);
            if (index != null) {
                for (int k = head; k <= index; k++) {
                    charToIndexMap.remove(queue.poll());
                }
                charToIndexMap.put(ch, tail);
                head = index + 1;
                continue;
            }
            charToIndexMap.put(ch, tail);
            int nowLen = tail - head + 1;
            if (nowLen > maxLen) {
                maxLen = nowLen;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        _3 o = new _3();
        System.out.println(o.lengthOfLongestSubstring("abcabcbb"));
    }

}
