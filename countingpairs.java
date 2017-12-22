
public class countingpairs {

	public static void main(String[] args) {
		int a[]={1,1,2,2,3,3};
		int b=countPairs(a,1);
		System.out.println(b);

	}
	static int countPairs(int[] numbers, int k) {
	      int n=numbers.length;
	      //int count=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {   if(numbers[i]==numbers[j])
	                numbers[j]=0;
	                if(numbers[j]==numbers[j+1])
	                numbers[j+1]=0;
	                //if((a[i]-a[j])||(a[j]-a[i]))
	            }
	        }
	        for(int l:numbers)
	            System.out.println(l);
	        return 0;
	    }

}
