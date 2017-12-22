package girija;
import java.util.Scanner;
public class charsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of rows");
		int rows=s.nextInt();
		System.out.println("enter no of columns");
		int col=s.nextInt();
		String c[][]=new String[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j]=s.next();
			}
		}
		String a[][]=new String[col][rows];
		System.out.println(" transpose");
		for(int i = 0; i < rows; i++)
    	{
      	    for( int j = 0; j < col; j++)
            {
               a[col][rows]=c[rows][col];
            }
            System.out.println(" ");
        }
		System.out.println("sorting");
	for(int k=0;k<rows;k++)
		{
		
			for (int i = 0; i < rows; i++) 
			{
				for (int j = i + 1; j < col; j++) 
				{
					if (c[k][i].compareTo(c[k][j])>0) 
					{
						String  temp = c[k][i];
						c[k][i] = c[k][j];
						c[k][j] = temp;
					}
				}
            }
        }
    
	for(int i = 0; i < col; i++)
	{
  	    for( int j = 0; j < rows; j++)
        {
            System.out.print(c[j][i]+" ");
        }
        System.out.println(" ");
    }

		System.out.println("final output");
		for(String b[]:c)
		{
			for(String d:b)
			{
				System.out.print(d+" ");
			}
			System.out.println();
		}
       
	}

}
