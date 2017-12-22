package easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class jumpingjack {
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        System.out.println("enter n value");
        int n=s.nextInt();
        System.out.println("enter k value");
        int k=s.nextInt();
        int l=maxStep(n,k);
        System.out.println(l);
    }
	static int maxStep(int n, int k) 
	 {
	       int max=0;
	        for(int i=1;i<=n;i++)
	        {
	            if(i+max!=k)
	            {
	                max=max+i;
	            }
	            else
	            {
	                max=max+i-1;
	            }
	        } return max;
	   }
	 
	}

