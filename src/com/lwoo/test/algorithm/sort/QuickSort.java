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
