package exception;

public class Amount 
	 {
	 	 double balance;
	 	 static int rem;
	 	public Amount(double b)
	 	{
	 		balance=b;
	 	}
	 	
	 	public void withdraw(int amount) throws InsufficientFundException
	 	{
	 		if(amount>balance)
	 		{
	 			 int shot=(int)(amount-balance);
	 			String s="shortage of"+shot+"Rs";
	 			throw new InsufficientFundException(s);
	 		}
	 		rem=(int)(balance-amount);
	 		
	 	}
	 	public double getBalance()
	 	{
	 		return rem;
	 	}
	 }


