package assignment3;

public class Overriding {
	void run() {System.out.println("run time");} 
	
}
class Car extends Overriding{
	void run()
	{System.out.println("run time poly");}
}
class Bike extends Overriding{
	void run()
	{System.out.println("run 2 time poly");}



public static void main(String args[]) {
	Car a= new Car();
	a.run();
	Bike b=new Bike();
	b.run();
}
	
}
