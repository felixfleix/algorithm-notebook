package com.felix.leetcode;

/**
 * 852.山峰数组的峰顶索引
 */
public class _852 {

    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int position = len / 2;
        while (!(arr[position] > arr[position + 1] && arr[position] > arr[position - 1])) {
            if (arr[position] <= arr[position + 1]) {
                start = position;
            } else if (arr[position] <= arr[position - 1]) {
                end = position;
            }
            position = start + (end - start) / 2;
        }
        return position;
    }

}