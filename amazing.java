
public class amazing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"ab","abaa","abaaaba"};
		int []a=minimalOperations(arr);
		for(int n:a)
			System.out.println(n);

	}
	 static int[] minimalOperations(String[] words) {
	        int n=words.length;
	        int a[]=new int[n];
	        int count=0;
	        for(int i=0;i<n;i++)
	        {char[] c=words[i].toCharArray();
	            for(int j=0;j<c.length;j++)
	            {  
	                if(j!=c.length-1 && c[j]==c[j+1])
	                {
	                    c[j+1]='g';
	                    j=j+1;
	                    count++;
	                }
	            }
	            a[i]=count;
	            count=0;
	        }
	      return a;
	    }

}
