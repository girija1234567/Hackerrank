package girija;

public class selectionsort {

	public static void main(String[] args) {
		int a[]={10,2,0,8,1};
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			if(min!=i)
			{
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		for(int k:a)
		{
			System.out.println(k);
		}
	}
}
			

