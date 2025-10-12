package com.felix.leetcode;

/**
 * 263. 丑数
 *
 * @author felix
 */
public class _263 {

    public boolean isUgly2(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n > 1) {
            int k = 2;
            int p = n % 2;
            if (p != 0) {
                k = 3;
                p = n % 3;
                if (p != 0) {
                    k = 5;
                    p = n % 5;
                    if (p != 0) {
                        return false;
                    }
                }
            }
            n = n / k;
        }
        return true;
    }


    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n > 0) {
            if (n == 1) {
                return true;
            }
            if (five(n)) {
                n = n / 5;
                continue;
            }
            if (three(n)) {
                n = n / 3;
                continue;
            }
            if (two(n)) {
                n = n / 2;
                continue;
            }
            return false;
        }
        return true;
    }

    private boolean five(int n) {
        int p = n % 10;
        return p == 0 || p == 5;
    }

    private boolean three(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum % 3 == 0;
    }

    private boolean two(int n) {
        return n % 2 == 0;
    }
}
