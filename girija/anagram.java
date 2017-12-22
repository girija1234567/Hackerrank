package girija;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="mother in law";
String s2="hitler woman";
s1=s1.replace(" ","");
s2=s2.replace(" ","");
System.out.println(s1);
System.out.println(s2);

s1=s1.toLowerCase();
s2=s2.toLowerCase();
int count=0;
if(s1.length()!=s2.length())
	System.out.println("not anagram");
char c1[]=s1.toCharArray();
char c2[]=s2.toCharArray();
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
//for(char c:c1)
	//System.out.println(c);
for(int i=0;i<c2.length;i++)
{
	for(int j=i+1;j<c2.length;j++)
	{
		if(c2[i]>c2[j])
		{
			char temp=c2[i];
			c2[i]=c2[j];
			c2[j]=temp;
		}
	}
}
//for(char c:c1)
	//System.out.println(c);
for(int i=0;i<c1.length;i++)
{
	if(c1[i]==c2[i])
		count++;
	
}
if(count==c1.length)
	System.out.println("anagrams");	
else
	System.out.println("not anagrams");
}
}
