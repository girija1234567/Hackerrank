package girija;

public class stringsupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="AsaKLSLNKs mnddffdk jBJBSD";
		String s2=" ";
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c>='A' && c<='Z')
			{
				s2=s2+c;
			}
		}
		System.out.println(s2);
		char c1[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
		for(int j=i+1;j<c1.length;j++)
			{
			if(c1[i]>c1[j])
				{
				char temp=c1[i];
				c1[i]=c1[j];
				c1[j]=temp;
				}
			}
		}
		for(char c:c1)
			System.out.println(c);
	}

}
