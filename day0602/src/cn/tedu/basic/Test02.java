package cn.tedu.basic;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args){
		System.out.println("姓名：ck"+"年龄：18"+"性别：男");
		
		String name="王海涛";
		int age=16;
		String house="北京二十套四合院";
		System.out.println("我叫："+name+",今年"+age+"岁"+",我在"+house);
		
		String sName=new Scanner(System.in).nextLine();
		int iAge=new Scanner(System.in).nextInt();
		System.out.println("我叫："+sName+",今年："+iAge+"岁");
	}
}
