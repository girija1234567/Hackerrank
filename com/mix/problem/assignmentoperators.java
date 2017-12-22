package com.mix.problem;
import java.util.Scanner;
public class assignmentoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two values");
		int a=s.nextInt();
		int b=s.nextInt();
	      int c = 0;

	      c = a + b;
	      System.out.println("c = a + b = " + c );

	      c += a ;
	      System.out.println("c += a  = " + c );

	      c -= a ;
	      System.out.println("c -= a = " + c );

	      c *= a ;
	      System.out.println("c *= a = " + c );

	      a = 10;
	      c = 15;
	      c /= a ;
	      System.out.println("c /= a = " + c );

	      a = 10;
	      c = 15;
	      c %= a ;
	      System.out.println("c %= a  = " + c );

	      c <<= 2 ;
	      System.out.println("c <<= 2 = " + c );

	      c >>= 2 ;
	      System.out.println("c >>= 2 = " + c );

	      c >>= 2 ;
	      System.out.println("c >>= 2 = " + c );

	      c &= a ;
	      System.out.println("c &= a  = " + c );

	      c ^= a ;
	      System.out.println("c ^= a   = " + c );

	      c |= a ;
	      System.out.println("c |= a   = " + c );
	   }
	}


