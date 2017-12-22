package easy;
import java.util.Scanner;
public class arrayssort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int count=0;
		 for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
					count++;
			}
			int n1=n-count;
			//int c[]=new int[n-count];
		int b[]	=even(a,count);
		for(int b1:b)
		System.out.println(b1);
		System.out.println();
		int c[]=odd(a,n1);
		for(int c1:c)
			System.out.println(c1);
		System.out.println();
		int l=b.length+c.length;
	int e[]=merge(b,c,l);
	for(int e1:e)
		System.out.println(e1);
	System.out.println();
	System.out.println();
	int s1[]=selectionSort(e);
	for(int sel:s1)
		System.out.println(sel);

	}
 static int[] even(int a[],int count)
{
	 int k=0;
		int b[]=new int[count];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[k++]=a[i];
			}
		}
		
		return b;
		
}
 static int[] odd(int a[],int n1)
{
	 int k1=0;
		int c[]=new int[n1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				c[k1++]=a[i];
			}
		}
		
		return c;
}
 static int[] merge(int b[],int c[], int l)
 {	
	 int d[]=new int[l];
	 int n1=b.length;
	 int n2=c.length;
	int  i = 0; 
	  int  j = 0;
	   int k = 0;
	    
	    while (i < n1)
	    {
	        d[k] = b[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there
	       are any */
	    while (j < n2)
	    {
	        d[k] = c[j];
	        j++;
	        k++;
	    }
	 return d;
 }
 static int[] selectionSort(int e[])
 {
 for(int i=0;i<e.length;i++)
	{
		int min=i;
		for(int j=i+1;j<e.length;j++)
		{
			if(e[j]<e[min])
				min=j;
		}
		if(min!=i)
		{
			int temp=e[i];
			e[i]=e[min];
			e[min]=temp;
		}
	}
	return e;
}
}
