package girija;

public class question 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=100; i<=999;i++)
		{	 if(check(i))
			System.out.println(i);
		}
	}
	static boolean check(int i)
	{			int temp=i;
				int r1=i%10;
				//System.out.println(r1);
				i=i/10;
				int r2=i%10;
				//System.out.println(r2);
				i=i/10;
				int r3=i%10;
				//System.out.println(r3);
					
					
			if(r1+r2==r3 || r2+r3==r1 || r3+r1==r2)
				return true;
				else
				return false;


	}

}
