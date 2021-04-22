package com.lwoo.test.algorithm.sort;

import java.util.Arrays;

/**
 * @author hokli
 * @version 1.0
 * @date 2021/4/22 14:52
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] sort = {1,4,5,627,83,23,1,543,6,7};
        quickSort(sort, 0, sort.length - 1);
        System.out.println(Arrays.toString(sort));
    }

    /**
     * 1取一个基数值
     * 2从右至左，比较得到比这个基数值小的值索引，替换
     * 3从左至右，比较得到比这个基数值da的值索引，替换
     * 4得到基数值位置，基数值左边都是比它小，右边都是比它大的列表
     * 5对左半部分继续执行2、3、4
     * 6对右半部分继续执行2、3、4
     * @param arr
     * @param low
     * @param high
     */
    public static void quickSort(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        int baseValue = arr[low];
        while(start < end) {
            while(start < end && arr[end] >= baseValue)
                end --;
            if (arr[end] < baseValue) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            while(start < end && arr[start] <= baseValue)
                start ++;
            if (arr[start] > baseValue) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
        }
        if (start > low) {
            quickSort(arr, low, start - 1);
        }
        if (end < high) {
            quickSort(arr, end + 1, high);
        }
    }
}
