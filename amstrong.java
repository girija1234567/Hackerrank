import java.util.Scanner;
public class amstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt(),n2=n;int count=0;int temp=n;int sum=0;
		while(n>0)
		{
			n/=10;
			count++;
			
		}
		while(temp>0){
			int n1=temp%10;
			sum=sum+(int)Math.pow(n1,count);
			temp=temp/10;
		}
		System.out.println(sum);
	if(n2==sum)
		System.out.println("amstrong");
	else
		System.out.println("not amstrong");
	}

}
