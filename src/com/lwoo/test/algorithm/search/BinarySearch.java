package com.lwoo.test.algorithm.search;

/**
 *
 * 二分查找(前提，数组已经排好序)
 *
 * @author hokli
 * @version 1.0
 * @date 2021/4/22 14:43
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,9,543,4343};
        int biSort = binarySearch(arr, 7);
        System.out.println(biSort);
    }

    public static int binarySearch(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (high + low) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if(arr[mid] > element) {
                high = mid;
            } else if (arr[mid] < element) {
                low = mid;
            }
        }
        return -1;
    }
}
