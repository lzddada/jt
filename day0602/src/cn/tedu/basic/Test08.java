package cn.tedu.basic;

import java.util.Scanner;

/*
 * 使用三元运算符判断三个数的大小
 */
public class Test08 {
	public static void main(String[] args) {
		int max;
		System.out.print("i=");
		int i=new Scanner(System.in).nextInt();
		System.out.print("j=");
		int j=new Scanner(System.in).nextInt();
		System.out.print("k=");
		int k=new Scanner(System.in).nextInt();
		max=i>j?(i>k?i:k):(j>k?j:k);
		System.out.println("最大值为："+max);
	}
}
