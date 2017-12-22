package girija;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]={3,6,0,1,0,2,10};
			for(int i=0;i<a.length;i++)
			{
				for(int j=1;j<a.length-i;j++)
				{
					if(a[j-1]>a[j])
					{
						int temp=a[j-1];
						a[j-1]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int k:a)
				System.out.println(k);

	}

}
