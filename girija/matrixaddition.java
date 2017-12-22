package girija;
import java.util.Scanner;
public class matrixaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		System.out.println("enter first matrix elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter second matrix elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		System.out.println(" matrix addition ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int[] l:c)
		{
			for(int k:l)
			{
				System.out.println(k);
			}
		}
		
		
	}

}
