package assignment1;

public class Constructor {

	public Constructor() {
		// TODO Auto-generated constructor stub
	}
	
	public Constructor(int type1, int type2) {
		int number= type1;
		int number1= type2;
	}
	
	public Constructor(double type1, double type2) {
		double number= type1;
		double number1= type2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor object= new Constructor();   // default
		Constructor object2= new Constructor(1,2);
		Constructor object3= new Constructor(22.34,23.567);
		Constructor object4= new Constructor();
		Constructor object5= new Constructor(22,33);
		
		



	}

}