package cn.tedu.basic;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args){
		System.out.println("������ck"+"���䣺18"+"�Ա���");
		
		String name="������";
		int age=16;
		String house="������ʮ���ĺ�Ժ";
		System.out.println("�ҽУ�"+name+",����"+age+"��"+",����"+house);
		
		String sName=new Scanner(System.in).nextLine();
		int iAge=new Scanner(System.in).nextInt();
		System.out.println("�ҽУ�"+sName+",���꣺"+iAge+"��");
	}
}
