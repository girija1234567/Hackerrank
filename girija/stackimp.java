package girija;

import java.util.Scanner;

public class stackimp {
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);        
	        System.out.println("Enter Stack size ");
	        int n = scan.nextInt();
	       Stack s = new Stack(n);
	       
	        char ch;
	        do{
	            System.out.println("\nStack Operations");
	            System.out.println("1. push");
	            System.out.println("2. pop");
	            System.out.println("3. peek");
	            System.out.println("4. check empty");
	            System.out.println("5. check full");
	            System.out.println("6. size");
	            int choice = scan.nextInt();
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter integer element to push");
	                    s.push( scan.nextInt() );
	                break;                         
	            case 2 : 
	                    System.out.println("Popped Element = " + s.pop());
	                break;                         
	            case 3 :         
	                    System.out.println("Peek Element = " + s.peek());
	                break;                         
	            case 4 : 
	                System.out.println("Empty status = " + s.isEmpty());
	                break;                
	            case 5 :
	                System.out.println("Full status = " + s.isFull());
	                break;                 
	            case 6 : 
	                System.out.println("Size = " + s.getSize());
	                break;                         
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;
	            }
	            s.display();            
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);
	 
	        } while (ch == 'Y'|| ch == 'y');                 
	    }
	}


