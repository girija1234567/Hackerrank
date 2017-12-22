package girija;

public class sort {

	public static void main(String[] args) {
		int a[]=getOneBits(161);
		for(int c:a)
		{
			System.out.println("ele are "+c);
		}
	}
	static int[] getOneBits(int n)
	{ 
		int i=0;
	int temp=n;
		while(temp>0)
			{
			temp=temp/2;
		
			i++;
			}
		
		int [] a=new int[i];
		int count=0;int j;
		for(j=a.length-1;j>=0;j--)
		{
			a[j]=n%2;
			System.out.println("in array bits are  "+a[j]);
			n=n/2;
			if(a[j]==1)
			{
				count++;
			}
		}
		int c[]=new int[count+1];
		
		System.out.println("no of 1 are  "+count);
		int k=1;
		
		for(int h=0;h<a.length;h++)
		{
			c[0]=count;
			
			if(a[h]==1)
			{
				c[k++]=h+1;
				
			}
			
		}
			
		
		return c;	
	}
}



		

