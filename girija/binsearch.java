package girija;

public class binsearch {

	static int binarySearch(int arr[], int l, int r, int x)
		{
		  while (l <= r)
		  {
		    int mid = l + (r-l)/2;
		    if (arr[mid] == x) 
		        return mid;  
		    if (arr[mid] < x) 
		        l = mid + 1; 
		    else
		         r = mid - 1; 
		  }
		  return -1; 
		}
	}


