package cn.tedu.basic;
/*
 * �ж���������Ƿ���ż��
 */
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		System.out.print("��������ǣ�");
		int i=new Scanner(System.in).nextInt();
		if(i%2==0){
			System.out.println(i+"��ż��");
		}else{
			System.out.println(i+"������");
		}
	}
}
