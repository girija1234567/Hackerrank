package com.mix.problem;
import java.util.Scanner;
public class arithmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("addition: "+(a+b));
		System.out.println("substraction: "+(a-b));
		System.out.println("multiplication: "+(a*b));
		System.out.println("division: "+(a/b));
		System.out.println("modulo division: "+(a%b));
		System.out.println("increment value:"+(++a));
		System.out.println("dicrement value:"+(--b));
		

	}

}
