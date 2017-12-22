package girija;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abc";
char c[]=s1.toCharArray();
for(int i=0;i<c.length;i++)
{
	for(int j=0;j<c.length;j++)
	{
		for(int k=0;k<c.length;k++)
		{ if(i!=j && j!=k && k!=i){
			System.out.print(c[i]);
			System.out.print(c[j]);
			System.out.print(c[k]);
			System.out.println();
		}
		}
		
	}
	
}
	}

}
