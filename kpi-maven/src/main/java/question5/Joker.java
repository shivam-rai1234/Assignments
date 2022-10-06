package question5;

public class Joker extends Polyimplimentation{
	String name;
	String dance;
	Joker()
	{
		
	}
	Joker(String name,String dance)
{
	this.name=name;
	this.dance=dance;
	
}
	@Override
	String dance() {
		// TODO Auto-generated method stub
		return "here we sho every joker showing there unique dance";
	}
public static void main(String args[])
{
	Joker n1= new Joker();
	Joker n2= new Joker();
	Joker n3= new Joker();
	Joker n4= new Joker();
	Joker n5= new Joker();
	Joker n6= new Joker();
	Joker n7= new Joker();
	Joker n8= new Joker();
	Joker n9= new Joker("Joker1","kathakli");
	Joker n10= new Joker("Joker2","Disco");
	Joker n11= new Joker("Joker3","Hip op");
	Joker n12= new Joker("Joker4","Nagin dnace");
	Joker n13= new Joker("Joker5","Bhangda");
	Joker n14= new Joker("Joker6","odissi");
	Joker n15= new Joker("Joker7","mohiniattam");
	Joker n16= new Joker("Joker8","bharatnatyam");
	
	System.out.println(n1.name+" is danceing "+n1.dance);
	System.out.println(n2.name+" is danceing "+n2.dance);
	System.out.println(n3.name+" is danceing "+n3.dance);
	System.out.println(n4.name+" is danceing "+n4.dance);
	System.out.println(n5.name+" is danceing "+n5.dance);
	System.out.println(n6.name+" is danceing "+n6.dance);
	System.out.println(n7.name+" is danceing "+n7.dance);
	System.out.println(n8.name+" is danceing "+n8.dance);
	System.out.println(n9.name+" is danceing "+n9.dance);
	System.out.println(n10.name+" is danceing "+n10.dance);
	System.out.println(n11.name+" is danceing "+n11.dance);
	System.out.println(n12.name+" is danceing "+n12.dance);
	System.out.println(n13.name+" is danceing "+n13.dance);
	System.out.println(n14.name+" is danceing "+n14.dance);
	System.out.println(n15.name+" is danceing "+n15.dance);
	System.out.println(n16.name+" is danceing "+n16.dance);
	
	
}

}
