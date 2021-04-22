package com.lwoo.test.algorithm;

/**
 * 冒泡排序
 * @author hokli
 * @version 1.0
 * @date 2021/4/22 14:24
 */
public class BubblleSort {

    public static void main(String[] args) {
        int[] sort = {1,4,5,6,7,83,23,1,543,6,7};
        bubbleSort(sort);
        System.out.println(sort);
    }

    public static void bubbleSort(int [] a){
        int i, j, n = a.length;
        for(i=0; i<n; i++){//表示 n 次排序过程。
            for(j=1; j<n-i; j++){
                if(a[j-1] > a[j]){
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
