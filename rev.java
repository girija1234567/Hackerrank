
public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			int n=i;
			int rev=0;
			while(n>0)
			{
				int n1=n%10;
				rev=rev*10+n1;
				n=n/10;
			}
			if(i==rev)
				System.out.println(i+" is palindrome");
			else
				System.out.println(i+"is not palindrome");

	}

}
}
