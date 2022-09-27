package assignment1;

public class Constructor {

	public Constructor() {
		// TODO Auto-generated constructor stub
	}
	
	public Constructor(int type1, int type2) {
		int num1= type1;
		int num2= type2;
	}
	
	public Constructor(double type1, double type2) {
		double num1= type1;
		double num2= type2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj= new Constructor();   // default
		Constructor obj2= new Constructor(1,2);
		Constructor obj3= new Constructor(22.34,23.567);
		Constructor obj4= new Constructor();
		Constructor obj5= new Constructor(22,33);
		



}
