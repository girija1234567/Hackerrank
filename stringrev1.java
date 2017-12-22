import java.util.Scanner;
public class stringrev1 extends Thread {

	String s2="";
	public void run()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter sting");
		String s1=s.nextLine();
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		if(s1.equals(s2))
		System.out.println("string is palindrome");
		else
		System.out.println("String is not palindrome");
	}
}
