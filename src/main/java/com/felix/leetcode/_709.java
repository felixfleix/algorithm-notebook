package com.felix.leetcode;

/**
 * 709. 转换成小写字母
 *
 * @author felix
 */
public class _709 {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char)(c + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
