package girija;
import java.util.Scanner;
public class binarysearch {
 public static void main(String args[])
 {
	 int a[]={2,4,6,7,8,10,15};
	 int count=0;
	 int l=0;
	 int r=a.length;
	 int mid=(l+r)/2;
	 System.out.println("enter search element");
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 for(int i=0;i<r;i++)
	 {
		 
		  if(n<a[mid])
		 {
			 r=mid+1;
		 }
		 else if(n>a[mid])
		 {
			 l=mid-1;
		 }
		 else if(n==a[mid]){
				 System.out.println("element found at:" +mid);
				 count++;
				 break;
				 	}
		 
		  mid=(l+r)/2;
		 
		
	 }
	 if(count==0)
		  System.out.println("element not found");
	}
}
