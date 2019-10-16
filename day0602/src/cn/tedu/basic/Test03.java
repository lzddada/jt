package cn.tedu.basic;
/*
 * 进行圆的周长和面积的计算
 */
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("圆的半径r=");
		double r=new Scanner(System.in).nextDouble();
		System.out.println("半径为："+r+"的圆的周长为:"+2*3.14*r);//2πr
		System.out.println("半径为："+r+"的圆的面积为:"+3.14*r*r);//πr*r
	}

}
