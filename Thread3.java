import java.util.Scanner;
public class Thread3 extends Thread
{
	public void run()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n2=s.nextInt();
		for(int i=1;i<=n2;i++)
		{
			int n=i;
			int rev=0;
			while(n>0)
			{
				int n1=n%10;
				rev=rev*10+n1;
				n/=10;
			}
			if(i==rev)
				System.out.println(i+" is palindrome");
			else
				System.out.println(i+"is not palindrome");
			try{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				
			}
		}
	}

}
