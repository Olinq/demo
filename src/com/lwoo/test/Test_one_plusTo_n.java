package com.lwoo.test;

public class Test_one_plusTo_n {
	/**
	 * 递归调用实现1+2+3+4+...+n
	 * @param i
	 * @return
	 */
	public static int sum(int i){
		if(i==1){
			return 1;
		}else{
			return sum(i-1)+i;
		}
		
	}
	public static int sum1(int n){
	        int sum=n;
	        boolean t=(sum!=0)&&(sum+=sum1(n-1))!=0;
	        return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(100));
		System.out.println(sum1(100));
		System.out.println(3-2.6==0.4);
	}
}
