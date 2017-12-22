package easy;
import java.util.Scanner;
public class puzzle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l=countHoles(n);
		System.out.println(l);
	}
	static int countHoles(int num) {
	    int holes=0;int sum=0;
	        while(num>0)
	        {
	            int n1=num%10;
	            sum+=get(n1);
	            num/=10;
	        }
	      
	       return sum;
	    }
	public static  int get(int i)
	        {
	            if(i==1||i==2||i==3||i==5||i==7)
	                return 0;
	            if(i==0||i==4||i==6||i==9)
	                return 1;
	            else
	                return 2;
	        }

}
