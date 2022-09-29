package assignment3;

public class Overloading {
	void show(int num1)
	{	
		int a=num1*num1;
		System.out.println("square of "+num1+""+" is = " + a);
	}
	void show(int num1,int num2)
	{    int num3=num1+num2;
		System.out.println("adding of "+num1+" + "+"num2"+" =  "+ num3);
	}
	void show(int num1,int num2,int c)
	{    int num3=num1*num2*c;
		System.out.println("multiply of "+num1+" * "+num2+" * "+c+" = " + num3);
	}
public static void main(String[]arg)
{
	Overloading obj = new Overloading();
	obj.show(4);
	obj.show(40,50);
	obj.show(4,5,6);
	
}

}
