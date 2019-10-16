package cn.tedu.basic;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
//		System.out.print("年龄为：");
//		int Age=new Scanner(System.in).nextInt();
//		System.out.print("性别：");
//		String Sex=new Scanner(System.in).nextLine();	
//		System.out.print("婚否：");
//		String Is=new Scanner(System.in).nextLine();
//		System.out.println("薪水为：");
//		int Money=new Scanner(System.in).nextInt();
		
//		System.out.println("年龄为："+Age+" 性别为"+Sex+" 婚否："+Is+"薪水为："+Money);
//		   int a=1;
//		   int b=3;
//		   char d='2';
//		   int x=d;
//		   int c=a+b;//结果是多少
//		       c=a+d;
//		       System.out.println(c);
//		 double d1 = 3.0 - 2.6; 
//		 double d2 = 30/300;
//		 double d3 = 1/2 + 0.5;
//		 double d4 = 2.5 * 1.5;
//
//		 System.out.println(d1+"-"+d2+"-"+d3+"-"+d4);
//			char a='a';
//			int x=a;
//		for(int i=97;i<=123;i++){
//			 i=97;
//			 char a=(char) i;
//			System.out.println(""+"的ASCII码为："+a);
//		}
		System.out.println("输入a的值为：");
		int a=new Scanner(System.in).nextInt();
		System.out.println("输入b的值为：");
		int b=new Scanner(System.in).nextInt();
		System.out.println("输入c的值为：");
		int c=new Scanner(System.in).nextInt();
		int max=a>b?(a>c?a:c):(b>c?b:c);
	    int min=a<b?(a<c?a:c):(b<c?b:c);
	    if(max==a){
	    	if(min==b){
	    		System.out.println("a:"+a+">"+"c:"+c+">"+"b:"+b);
	    	}else if(min==c){
	    		System.out.println("a:"+a+">"+"b:"+b+">"+"c:"+c);
	    	}
	    }else if(max==b){
	    	if(min==a){
	    		System.out.println("b:"+b+">"+"c:"+c+">"+"a:"+a);
	    	}else if(min==c){
	    		System.out.println("b:"+b+">"+"b:"+b+">"+"c:"+c);
	    	}
	    }else{
	    	if(min==a){
	    		System.out.println("c:"+c+">"+"b:"+b+">"+"a:"+a);
	    	}else if(min==b){
	    		System.out.println("c:"+c+">"+"a:"+a+">"+"b:"+b);
	    	}
	    }

}
}

