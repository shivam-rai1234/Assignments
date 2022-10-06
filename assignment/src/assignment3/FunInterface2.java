package assignment3;
//here we create functional interface with the help of lambda function

public	class FunInterface2 {
		
		public static void main(String args[])
	    {
	  
	        // lambda expression to create the object
	        new Thread(() -> 
	        {
	            System.out.println("New thread created");
	        }
	        				).start();
	    }
	}



