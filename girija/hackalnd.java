package girija;

public class hackalnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String votes[]={"girija","geetha","girija","geetha","kanusha","girija","geetha"};

	}
	static String electionWinner(String[] votes) {
        int l=votes.length;int count=0;
       int a[]=new int[10];
        int k1=0;
        String s1[]=new String[10];int k=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(votes[i].equals(votes[j]))
                {
                    count++;
                    
                   // s1[k++]=votes[i];
                    a[k1++]=count;
                } 
            }
           
            
        }
        for(int k2:a)
        	System.out.println(k2);
       //for(String s:s1)
        //{
         //   System.out.println(s);
       //}
        int n=k;
        for (int i=0;i<n;i++) 
        {
            for (int j=i+1; j<n; j++) 
            {
                if (s1[i].compareTo(s1[j])>0) 
                {
                   String temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        
        return s1[k-1];
    }


}
