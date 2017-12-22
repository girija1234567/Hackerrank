package girija;
		import java.util.*;
		class Stack
		{
		     int arr[];
		     int top, size, len;
		    public Stack(int n)
		    {
		        size = n;
		        len = 0;
		        arr = new int[size];
		        top = -1;
		    }
		    public boolean isEmpty()
		    {
		        return top == -1;
		    }
		    public boolean isFull()
		    {
		        return top == size -1 ;        
		    }
		    public int getSize()
		    {
		        return len ;
		    }
		    public int peek()
		    {
		        return arr[top];
		    }
		    public void push(int i)
		    {
		        if(top + 1 >= size)
		            throw new IndexOutOfBoundsException("Overflow Exception");
		        if(top + 1 < size )
		            arr[++top] = i;
		        len++ ;
		    }
		    public int pop()
		    {
		        if( isEmpty() )
		            throw new NoSuchElementException("Underflow Exception");
		        len-- ;
		        return arr[top--]; 
		    }    
		    public void display()
		    {
		        System.out.print("\nStack = ");
		        if (len == 0)
		        {
		            System.out.print("Empty\n");
		            return ;
		        }
		        for (int i = top; i >= 0; i--)
		            System.out.print(arr[i]+" ");
		        System.out.println();
		    }    
		}
		 
		/*  Class StackImplement  */
	