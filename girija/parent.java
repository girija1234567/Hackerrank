package girija;

public class parent {
void m1()
{
	System.out.println("m1 method");
}
}


class child extends parent
{
	void m1()
	{
		System.out.println("m1 meth");
	}
	public static void main(String args[])
	{
		parent c= new child();
		child child= (child)new parent();
		
	}
}
