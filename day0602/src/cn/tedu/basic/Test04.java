package cn.tedu.basic;
/*
 * ��a��b���е���
 */
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		int c;
		System.out.print("a:");
		int a=new Scanner(System.in).nextInt();
		System.out.print("b:");
		int b=new Scanner(System.in).nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("a:"+a+",b:"+b);
	}
}
