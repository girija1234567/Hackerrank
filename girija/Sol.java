package girija;
import java.util.Scanner;
public class Sol 
{

	public static void main(String[] args)
	{
			Scanner s=new Scanner(System.in);
			System.out.println(" enter number");
			int n=s.nextInt();
			System.out.println(isPrime(n));
	}
 public static int isPrime(int n)
 {
	 	int k=0;
	 	for(int i=2;i<=n/2;i++)
	 	{	 
		     if(n%i==0) 
		     {
			     k++;
			     if(k==1) return i;
		     }
		  
	   }return 1;
 }
}
