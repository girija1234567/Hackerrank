package easy;
import java.util.Scanner;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int top=-1;
		System.out.println("enter size");
		int size=s.nextInt();
		int a[]=new int[size];
		while(true){
		System.out.println("stack implementation");
		System.out.println("1. push");
		System.out.println("2. pop");
		System.out.println("3. display");
		System.out.println("4. exit");
		
		System.out.println("enter the choice ");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			if(top==size)
				System.out.println("stack is full");
			if(top==-1)
				a[++top]=s.nextInt();
			else 
				a[top++]=s.nextInt();
			break;
		case 2:
			if(top==-1)
				System.out.println("stack is empty");
			else{
				System.out.println(a[top]);
			top--;
			}
			break;
		case 3:
			if(top>0)
			{
				for(int i=0;i<=top;i++)
					System.out.println(a[i]);
			}
			break;
		case 4:
			System.exit(0);
			
		}
		}
		
		

	}

}
