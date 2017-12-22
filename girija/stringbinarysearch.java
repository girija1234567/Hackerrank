package girija;
import java.util.Scanner;
public class stringbinarysearch {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String s1=s.nextLine();
	String s2=" ";
	int count=0;
	for(int i=0;i<s1.length();i++)
	{
		char c=s1.charAt(i);
		if(c>='A' && c<='Z')
		{
			s2=s2+c;
		}
	}
//	if(s1.length()>10 && s2.length()==5){
	char c1[]=s2.toCharArray();
	
	System.out.println(s2);
		for(int i=0;i<c1.length;i++)
		{
		for(int j=i+1;j<c1.length;j++)
			{
			if(c1[i]>c1[j])
				{
				char temp=c1[i];
				c1[i]=c1[j];
				c1[j]=temp;
				}
			}
		}
	for(char f:c1)
		System.out.println(f);
	System.out.println("enter search charcter");
	char c=s.next().charAt(0);
	int n=binarySearch(c1,c);
	if(n==-1)
		System.out.println("element not found");
	else
	{
		for(int i=0;i<s2.length();i++)
		{
			if(c1[i]==c)
				count++;
		}
		System.out.println(count);
	}
		
	}

//}
//else
	//System.out.println("enter valid input");

static int binarySearch(char arr[], char x)
{int l=0; int count=0;
int r=arr.length;
  while (l <= r)
  {
    int mid = l + (r-l)/2;
    if (arr[mid] == x)
    {
     return mid;
    }
    
    if (arr[mid] < x) 
        l = mid + 1; 
    else
         r = mid - 1; 
  }
  return count; 
}
}
