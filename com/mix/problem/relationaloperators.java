package com.mix.problem;
import java.util.Scanner;
public class relationaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two values");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a==b) 
			System.out.println("both values are equal");
		 if(a!=b)
			System.out.println("both values are not equal");
		 if(a>b)
			System.out.println("a is greater than b value");
		 if(a<b)
			System.out.println("a is lesser than b value");
		 if(a>=b)
			System.out.println("a is greater than or equal to b");
		else
			System.out.println("a is lesser than or equal to b");
	}

}
