
public class SharingCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int[] a=new int[input.length];
		int current = input[0];
		boolean found = false;

		for (int i = 0; i < input.length; i++) {
		    if (current == input[i] && !found) {
		        found = true;
		    } else if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		        found = false;
		    }
		}
		for(int i=0;i<input.length;i++){
		System.out.print(a[i]=current);
		}
		int k=2;
       int  res = countPairs(a, k);
	}
static int countPairs(int[] numbers, int k) {
	int count=0;
    for(int i=0;i<numbers.length;i++)
    {
        for(int j=i+1;j<numbers.length;j++)
        {
            if((numbers[i]-numbers[j]==k) ||(numbers[j]-numbers[i]==k))
                count++;
        }
    }
    return count;
        

    }

}
	