package com.felix.leetcode;

/**
 * 2586. 统计范围内的元音字符串数
 *
 * @author felix
 */
public class _2586 {
    public int vowelStrings(String[] words, int left, int right) {
        String[] vowels = {"a", "e", "i", "o", "u"};

        int count = 0;

        for (int i = left; i <= right; i++) {
            String word = words[i];
            boolean maybeTrue = false;

            boolean yes = false;

            for (String vowel : vowels) {
                if (word.startsWith(vowel)) {
                    maybeTrue = true;
                    break;
                }
            }

            if (maybeTrue) {
                for (String vowel : vowels) {
                    if (word.endsWith(vowel)) {
                        yes = true;
                        break;
                    }
                }
            }

            if (yes) {
                count++;
            }
        }

        return count;
    }
}
