package com.mix.problem;

public class innerexm {
private static int i=10;
	static class inner
	{
		 void add(int a,int b)
		 {
			 System.out.println(a+b);
		 }
		 void display()
		 {
			 System.out.println(i);
		 }
	}
	public static void main(String[] args) {
		//innerexm x=new innerexm();
	//	inner e=x.new inner();
		//x.inner.add(10,10);
		innerexm.inner a=new innerexm.inner();
		a.add(10, 10);
	}

}
