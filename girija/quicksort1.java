package girija;

public class quicksort1 {
			public static void main(String[] args) { 

			int arr[]={5,3,4,6,7,8,0,0,1,2}; 
			int low=0; 
			int high= arr.length-1; 
			Quick q=new Quick(); 
			q.quickSort(arr, low,high); 


			System.out.println("\nElements after sorting "); 

			for (int i = 0; i < arr.length; i++) 

			System.out.print(arr[i]+" "); 

			System.out.println(); 

			} 
			} 

			class Quick 
			{ 
			/** Quick sort function **/ 

			public void quickSort(int arr[], int low, int high) 

			{ 
			int i = low, j = high; 

			int temp; 

			int pivot = arr[(low + high) / 2]; 

			/** partition **/ 

			while (i <= j) 

			{ 

			while (arr[i] < pivot) 

			i++; 

			while (arr[j] > pivot) 

			j--; 

			if (i <= j) 

			{ 

			/** swap **/ 

			temp = arr[i]; 

			arr[i] = arr[j]; 

			arr[j] = temp; 

			i++; 

			j--; 

			} 

			} 
			/** recursively sort lower half **/ 

			if (low < j) 

			quickSort(arr, low, j); 

			/** recursively sort upper half **/ 

			if (i < high) 

			quickSort(arr, i, high); 
			} 

		}