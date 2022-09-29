package assignment3;

public class  Overloading{
	void show(int num1)
	{   int c=num1*num1;
		System.out.println("this is yor number square = " +c);
	}
	void show(int num1,int num2)
	{    int num3=num1+num2;
		System.out.println("here we perform sum =  "+ num3);
	}
public static void main(String[]arg)
{
	Overloading obj = new Overloading();
	obj.show(4);
	obj.show(40,50);
	obj.show(1,2);
	
}
}