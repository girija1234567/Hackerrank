package easy;

public class modifyprices {

	public static void main(String[] args) {
		String s1[]={aloo,jam,apple};
		float a[]={10.2,20.3,30.0};
		
		// TODO Auto-generated method stub

	}
	static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
        int n=origItems.length; int m=items.length; int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(items[i].equals(origItems[j])){
                  if(prices[i]!=origPrices[j])
                   count++;
                }
            }
        }
       return count;
    }


}
