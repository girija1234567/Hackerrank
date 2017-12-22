package girija;

public class quicksort {

	public static void main(String[] args) {
		int a[]={3,6,0,1,0,2,10};
		int i=0;
		int j=a.length-1;
		quicksort(a,i,j);
		for(int k:a)
		{
			System.out.println(k);
		}

	}
 static void quicksort(int a[],int i,int j)
{	if(i>=j) return;
	int pivot=divide(a,i,j);
	quicksort(a,i,pivot-1);
	quicksort(a,pivot+1,j);
	
	
}
static int divide(int a[],int i,int j)
{
	int pivot=a[i];
	int p=i+1;
	int q=j;
	while(p<=q)
	{
	while(a[p]<=pivot)
	{
		p++;
	}
	while(a[q]>pivot)
	{
		q--;
	}
	if(p<q)
	{
		int temp=a[p];
		a[p]=a[q];
		a[q]=temp;
	}

	}
	a[i]=a[q];
	a[q]=pivot;
	return q;
}

}
