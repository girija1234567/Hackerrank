package com.mix.problem;
import java.util.Scanner;
public class exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter product");
		String s1=s.nextLine();
		Product p=new Product();
		try
		{
		p.checkProduct(s1);
		System.out.println("product matched");
		
		}
		catch(ProductNotMatch a)
		{
			System.out.println(a);
		}
		
		

	}

}
