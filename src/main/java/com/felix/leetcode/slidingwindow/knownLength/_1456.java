package com.felix.leetcode.slidingwindow.knownLength;

public class _1456 {

    public int maxVowels(String s, int k) {
        int len = s.length();
        int start = 0;
        int maxCount = 0;
        for (int i = 0;i < k;i++) {
            if (this.isVowels(s.charAt(i))) {
                maxCount++;
            }
        }

        int temp = maxCount;

        for(int i = k;i<len;i++) {
            System.out.println(s.charAt(i));
            if (this.isVowels(s.charAt(i))) {
                temp++;
            }
            if (this.isVowels(s.charAt(start))) {
                temp--;
            }
            if (temp > maxCount) {
                maxCount = temp;
            }
            start++;
        }

        return maxCount;

    }

    private boolean isVowels(char c) {
        final char[] vowels = {'a','e','i','o','u'};
        for (char ch : vowels) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        _1456 o = new _1456();
        System.out.println(o.maxVowels(s,k));
    }

}
