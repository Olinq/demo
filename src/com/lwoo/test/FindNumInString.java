package com.lwoo.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 从字符串中提取数字
 * @author Lwoo
 *
 */
public class FindNumInString {

	public static void main(String[] args) {
		String str="love23next234csdn3423javaeye";
		System.out.println(str);
		System.out.println(find(str));
		System.out.println(find2(str));
		System.out.println(find3(str));
		
	}
	public static String find(String str){
		char[] c=str.toCharArray();
		String num="";
		for (int i = 0; i < c.length; i++) {
			try{
				num+=Integer.parseInt(""+c[i]);//非数字字符串转换会报 NumberFormatException 异常
			}catch(NumberFormatException e){
				continue;
			}
		}
		return num;
	}
	public static String find2(String str){
		String result="";
		if(str!=null&&!"".equals(str)){
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)>'0'&&str.charAt(i)<'9'){
					result +=str.charAt(i);
				}
			}
		}
		return result;
	}
	/**
	 * Pattern complie(String regex) 
	由于Pattern的构造函数是私有的,不可以直接创建,所以通过静态方法compile(String regex)方法来创建,将给定的正则表达式编译并赋予给Pattern类	
	 * @param str
	 * @return
	 */
	public static String find3(String str){
		String result="";
		String regEx="[^0-9]";
		Pattern p=Pattern.compile(regEx);//Pattern类的作用在于编译正则表达式后创建一个匹配模式.
		Matcher m=p.matcher(str);//Matcher类使用Pattern实例提供的模式信息对正则表达式进行匹配
		result=m.replaceAll("").trim();
		return result;
	}
}
