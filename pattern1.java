
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(getFib(k)+" ");
				k++;
			}
			System.out.println();
		}

	}
	static int getFib(int n)
	{
	
		if(n==1 ||n==2) return 1;
		if(n>2)
			return getFib(n-1)+getFib(n-2);
		else
			return 0;
			
	}

}
