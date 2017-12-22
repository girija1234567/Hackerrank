package girija;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abebuinwwo";
		char c[]=s1.toCharArray();
		char c1[]=new char[s1.length()];
		int k=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'|| c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				c1[k++]=c[i];
		}
for(char a:c1)
	System.out.println(a);
	System.out.println(k);
	}

}
