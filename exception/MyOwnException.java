package exception;
import java.util.Scanner;
public class MyOwnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Amount a=new Amount(3000);
		System.out.println("enter amount");
		int amount=s.nextInt();
		try
		{
			a.withdraw(amount);
			System.out.println("amount withdrawn");
			System.out.println("available balance:"+a.getBalance());
		}
		catch(InsufficientFundException e)
		{
			String s1=e.getMessage();
			System.out.println(s1);
		}
	}

}
