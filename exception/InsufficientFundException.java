package exception;

public class InsufficientFundException extends Exception
{
	InsufficientFundException()
	{
		super("less balance");
	}
	InsufficientFundException(String s)
	{
		super(s);
	}
}
