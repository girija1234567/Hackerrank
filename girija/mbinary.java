package girija;
import java.util.Scanner;
public class mbinary {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int arr[]={2,6,2,10,3,5,7};
		mergeSort(arr, 0,arr.length-1);
		for(int k1:arr)
			System.out.println(k1);
		binsearch b=new binsearch();
		int l=0,r=arr.length;
		System.out.println("enter search element");
		int x=s.nextInt();
		int n=b.binarySearch(arr,l,r,x);
		if(n==-1)
			System.out.println("element not found");
		else
			System.out.println("element found :"+(n+1));
	}
	static void merge(int arr[], int l, int m, int r)
	{
		int i, j, k;
		int n1 = m - l + 1;
		int n2 =  r - m;

		int L[]=new int[n1];
		int R[]=new int[n2];
		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[m + 1+ j];
		i = 0; 
		j = 0; 
		k = l; 
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void mergeSort(int arr[], int l, int r)
	{
		if (l < r)
		{
			int m = l+(r-l)/2;
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m, r);
		}
	}

}

