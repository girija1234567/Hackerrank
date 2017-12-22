
  class ProductNotMatch extends Exception
{
	ProductNotMatch(String s)
	{
		super(s);
	}
}
 class Product
{
	String pname="pen";
	String checkProduct(String pname) throws ProductNotMatch
	{
		if(pname.equals("pen"))
			return "productmatch";
		else
			throw new ProductNotMatch(pname);
	}
	
}