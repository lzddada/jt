package cn.tedu.basic;

public class Test05 {
	public static void main(String[] args) {
		
		System.out.println(300000000l*60*60*24*365);//整数运算溢出
		System.out.println(1-0.8);
		System.out.println(8/0.0);
		//一个数除以0.0都是无穷大（0/0.0是NaN：not a number）
	}
}
