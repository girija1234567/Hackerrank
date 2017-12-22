package girija;
import java.util.Scanner;
public class recursion {
	
	public static void main(String[] args) 
    {	Scanner s=new Scanner(System.in);
    	System.out.println("enter string");
        String s1 = s.nextLine();
        reverse(s1);
    }   
	
	
		static  void reverse(String s1)
		    {
		        if ((s1==null)||(s1.length() <= 1))
		           System.out.println(s1);
		        else
		        {
		            System.out.print(s1.charAt(s1.length()-1));
		            reverse(s1.substring(0,s1.length()-1));
		        }
		    }
		     
		     
}

