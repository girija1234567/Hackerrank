package girija;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.nextLine();
		s1=s1.toLowerCase();
		for(int i=0;i<s1.length()/2-1;i++)
		{
			if(s1.charAt(i)==s1.charAt(s1.length()-1-i))
			System.out.println("palindome");
			else
				System.out.println("not palindrome");
		}

	}

}
