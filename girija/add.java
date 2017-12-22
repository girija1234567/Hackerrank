package girija;
import java.util.Scanner;

public class add {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(" enter two floating point numbers");
	float a=s.nextFloat();
	float b=s.nextFloat();
	System.out.println(add(a,b));

	}
	public static int add(float num1,float num2)
	{
		int n=(int)(num1+num2);
		return n;
	}

}
