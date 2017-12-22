
public class evenorodd
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread t1=new Thread1();
		Thread t2=new Thread2();
		Thread t=new Thread3();
		t1.start();
		t2.start();
		t.start();
	}
}
