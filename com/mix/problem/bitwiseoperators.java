package com.mix.problem;
import java.util.Scanner;
public class bitwiseoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two values");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("a & b is:"+(a&b));
		System.out.println("a | b is:"+(a|b));
		System.out.println("a ^ b is:"+(a^b));
		System.out.println(" ~a is:"+(~a));
		System.out.println("a >>2 is:"+(a>>2));
		System.out.println("a <<2 is:"+(a<<2));
		System.out.println("a>>>2 is:"+(a>>>2));
		
	}

}
