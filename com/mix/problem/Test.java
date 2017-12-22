package com.mix.problem;

public class Test {
	
		public static void main(String args[])
		{
			System.out.println("main starts");
			stat s1=new stat();
			s1.j=20;
			stat.i=30;
			System.out.println("static value : "+stat.i);
			System.out.println(" non static value: "+s1.j);
			stat.m1();
			s1.m2();
			System.out.println("main ends");
			stat s2=new stat();
			s2.j=25;
			System.out.println("non static value:"+s2.j);
			System.out.println("non static value" +s1.j);
			stat.i=15;
			System.out.println("static value: "+stat.i);
		}
	}

