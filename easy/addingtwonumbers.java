package easy;
import java.util.Scanner;
public class addingtwonumbers
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		int n=addNumbers(a,b);
		System.out.println(n);

	}
	 static int addNumbers(float a, float b) 
	 {
	        int n=(int)(a+b);
			return n;

	    }
}
