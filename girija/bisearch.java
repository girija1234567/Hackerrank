package girija;

import java.util.Scanner;

public class bisearch {

	public static void main(String[] args) {
		int a[]={1,2,4,5,67};
		int l=0;int r=a.length-1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter searc element");
		int x=s.nextInt();
		int n=binarysearch(a,l,r,x);
		if(n==-1)
			System.out.println("element not found");
		else
			System.out.println("element found");

	}

	static int binarysearch(int arr[],int l,int r,int x)
	{
		while (l <= r)
		{
			int mid = (l + r)/2;
			if (arr[mid] == x) 
				return mid;  
			if (arr[mid] < x) 
				l = mid + 1; 
			else
				r = mid - 1; 
		}
		return -1; 
	}


}
