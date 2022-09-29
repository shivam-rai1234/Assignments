package assignment3;
//here we create functional interface with the help of lambda function

public	class FunInterface2 {
		public static void main(String args[])
		{
			// create anonymous inner class object
			new Thread(new Runnable() 
			{
				@Override public void run()
				{
					System.out.println("New thread created");
				}
			}
			).start();
		}
	}



