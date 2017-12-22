import java.util.Scanner;
class Thread1 extends Thread
	{
		public void run()
		{
			Scanner s=new Scanner(System.in);
			System.out.println(" enter n value");
			int n=s.nextInt();
			for(int i=0;i<=n;i++)
			{
				if(i%2==0)
					System.out.println(i+"is even number");
				try
				{
					Thread.sleep(200);
				}
				catch(Exception e)
				{
					
				}
				
			}
			
		}
	}

