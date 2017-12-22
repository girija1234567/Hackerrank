package girija;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static void merge(int arr[], int l, int m, int r)
		{
		    int i, j, k;
		    int n1 = m - l + 1;
		    int n2 =  r - m;
		 
		    /* create temp arrays */
		    int L[]=new int[n1];
		    int R[]=new int[n2];
		 
		    /* Copy data to temp arrays L[] and R[] */
		    for (i = 0; i < n1; i++)
		        L[i] = arr[l + i];
		    for (j = 0; j < n2; j++)
		        R[j] = arr[m + 1+ j];
		 
		    /* Merge the temp arrays back into arr[l..r]*/
		    i = 0; 
		    j = 0;
		    k = l;
		    while (i < n1 && j < n2)
		    {
		        if (L[i] <= R[j])
		        {
		            arr[k] = L[i];
		            i++;
		        }
		        else
		        {
		            arr[k] = R[j];
		            j++;
		        }
		        k++;
		    }
		 
		    /* Copy the remaining elements of L[], if there
		       are any */
		    while (i < n1)
		    {
		        arr[k] = L[i];
		        i++;
		        k++;
		    }
		 
		    /* Copy the remaining elements of R[], if there
		       are any */
		    while (j < n2)
		    {
		        arr[k] = R[j];
		        j++;
		        k++;
		    }
		}
		 
		/* p is for left index and r is right index of the
		   sub-array of arr to be sorted */
		void mergeSort(int arr[], int p, int r)
		{
		    if (p < r)
		    {
		        int q = p+(r-l)/2;
		        mergeSort(arr, p, q);
		        mergeSort(arr, q1+1, r);
		 
		        merge(arr, l, q, r);
		    }
		}
		 

	}

}
