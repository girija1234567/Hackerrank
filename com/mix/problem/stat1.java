package com.mix.problem;

public class stat1 {

		static
		{
			System.out.println(" static block execution");
		}
		{
			System.out.println("non static block execution");
		}
		stat1()
		{
			System.out.println("constructor");
		}
		static int i;
		int j;
		static void m1()
		{
			System.out.println("m1  static method execution starts");
			System.out.println(stat1.i);
			System.out.println("m1 execution ends");
		}
		void m2()
		{
			System.out.println("m2 non static method execution strats");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main starts");
		stat1 s1=new stat1();
		s1.j=20;
		stat1.i=30;
		System.out.println("static value : "+stat1.i);
		System.out.println(" non static value: "+s1.j);
		stat1.m1();
		s1.m2();
		System.out.println("main ends");
		stat1 s2=new stat1();
		s2.j=25;
		System.out.println("non static value:"+s2.j);
		System.out.println("non static value" +s1.j);
		stat1.i=15;
		System.out.println("static value: "+stat1.i);
	}

	}

