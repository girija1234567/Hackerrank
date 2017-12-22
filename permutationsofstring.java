
public class permutationsofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String s1 = "ABCD";
		        permute(s1.toCharArray(), 0, s1.length()-1);
		    }

		    public static void permute(char[] a, int start, int end) {
		        if(start == end){
		            System.out.println(String.valueOf(a));
		        }else{
		            for(int i=start;i<=end;i++) {
		                 swap(a, start, i );
		                 permute(a, start+1, end);
		                 swap(a, start, i );
		            }
		        }
		    }

		    public static void swap(char[] ary, int x, int y) {
		        char temp = ary[x];
		        ary[x] = ary[y];
		        ary[y] = temp;
		    }
		
	}


