package assignment2;
//Use super Keyword to refer to the parent class.
public class Superkey {
String color="red";
}
class Key extends Superkey{
	String color="white";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	}
class testSuper{
	public static void main(String args[])
	{
		Key d= new Key();
		d.printColor();
	}
	
}
