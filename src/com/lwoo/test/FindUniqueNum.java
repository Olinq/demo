package com.lwoo.test;

/**
 * 从一组数组中找出唯一不重复的数字
 * 利用异或的特性，相同为0，相异为1
 *
 * @author hokli
 * @version 1.0
 * @date 2021/1/27 15:35
 */
public class FindUniqueNum {

    public static void main(String[] args) {
        int[] nums = {1,4,5,8,8,1,5,4,9,3,3,9,6,7,7};
        int temp = nums[0];
        for (int i = 1; i < nums.length; i ++) {
           temp = temp^nums[i];
        }
        System.out.println(temp);
    }
}
