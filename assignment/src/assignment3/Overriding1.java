package assignment3;

public class Overriding1 {
	void run()
	  {System.out.println("Vehicle is running");}  
	}  
	  
class Bike2 extends Overriding1{  
	    
	void run()
	{System.out.println("Bike is running safely");}  
	 
public static void main(String args[])
{ 
	Overriding1 obj = new Bike2(); 
	 obj.run();  
}  
}
