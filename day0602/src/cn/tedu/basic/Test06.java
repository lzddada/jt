package cn.tedu.basic;
/*
 * 判断输入的数是否是偶数
 */
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		System.out.print("输入的数是：");
		int i=new Scanner(System.in).nextInt();
		if(i%2==0){
			System.out.println(i+"是偶数");
		}else{
			System.out.println(i+"是奇数");
		}
	}
}
