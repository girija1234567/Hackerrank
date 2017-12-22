package girija;

public class minimumstringmoves {

	public static void main(String[] args) {
		String A="aab";
		String B="baa";
		for(int i=0;i<A.length();i++){
		if(A.charAt[0]!=B.charAt[0]){
			  if(A.charAt[0]==B.charAt[length-1]){
			   swap(B[0], B[length-1]);
			  }
			  else if(B[0]==A[length-1]){
			   swap(A[0],A[length-1]);
			  }
	 }
			for(int i=0;i<A.length();i++){
			 if(A[i]==B[i]){
			  continue;
			 }
			 for(int j=i+1;j<A.length();j++){
			  if(A[i]==B[j]){
			   for(int k=j;k>i;k--){
			    swap(B[k],B[k-1]);
			   }
			 break;
			  else if(B[i]=A[j]){
			   for(int k=j;k>i;k--){
			    swap(A[k],A[k-1]);
			   }
			 break;
			 }
			}if(A==B){
			break;
			}

	}

}
