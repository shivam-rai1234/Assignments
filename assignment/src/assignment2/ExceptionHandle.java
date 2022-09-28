package assignment2;
//Write a program to handle exceptions while dividing the number by 0
public class ExceptionHandle {
public static void main(String args[])
{
	 int num1 = 15, num2 = 0, result = 0;
	 try{
         result = num1/num2;
         System.out.println("The result is" +result);
	 }
	 catch (ArithmeticException e) {
         
         System.out.println("Arithmetic Exception");
	 }
	 finally
	 {
         
         System.out.println("number can not divided by 0 ");
}
}
}