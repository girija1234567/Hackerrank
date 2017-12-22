package girija;

public class noofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="0003+";
		char c[]=s1.toCharArray();
		//System.out.println(s1.length());
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='+' || c[i]=='-')
				System.out.println(s1.length()-1);
		}

	}

}
