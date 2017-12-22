package easy;

import java.util.Scanner;

public class mergestrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1="abc";
		String s2="def";
		String s3=mergeStrings(s1,s2);
		System.out.println(s3);
		

	}
	static String mergeStrings(String a, String b) {
        String s1="";
        int i;
        int a1=a.length();
        int b1=b.length();
        int len=Math.min(a1,b1);
        for(i=0;i<len;i++)
        {
        s1=s1+a.charAt(i)+b.charAt(i);
        }
        if(a1>len){
            s1=s1+a.substring(i);
               }
        else{
            s1=s1+b.substring(i);
        }
     
        return s1;

    }


}
