package easy;

public class cha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1[]={'g','i','r','i','j','a','a'};
		char c2[]=new char[10];int k=0;int count=0;
		for(int i=0;i<c1.length;i++)
		{
		for(int j=i+1;j<c1.length;j++)
		{
			if(c1[i]==c1[j])
			{
				//c1[i]='2';
				c1[j]='2';
			}
	
		}
		}
		char a[]=new char[5];int l=0;
		for(char c:c1)
		{
			if(c!='2')
			{
				a[l++]=c;
			}
		}
		for(char b:a)
			System.out.println(b);
	}
}

