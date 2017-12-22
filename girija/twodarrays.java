package girija;
import java.util.Scanner;
public class twodarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int n=s.nextInt();
		System.out.println("enter no of columns");
		int m=s.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=s.nextInt();
			}
		}

		for(int b[]:a)
		{
			for(int c:b)
			{
				System.out.print(c);
			}
			System.out.println();
		}
			for(int i=0;i<3;i++)
			{
				for(int j=i+1;j<3;j++)
				{ 
					if(a[0][i]>a[0][j])
					{
					int temp=a[0][j];
					a[0][j]=a[0][i];
					a[0][i]=temp;
					}
				}
			}
			for(int i=0;i<3;i++)
			{
				for(int j=i+1;j<3;j++)
				{
					if(a[1][i]<a[1][j])
					{
					int temp=a[1][i];
					a[1][i]=a[1][j];
					a[1][j]=temp;
					}
				}
			}
				
	
		for(int d[]:a)
		{
			for(int e:d)
			{
				System.out.print(e+"  ");
			}
			System.out.println();
		}
	}
}


