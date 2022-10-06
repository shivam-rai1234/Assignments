package question6;

import java.util.ArrayList;

public class Arraylist {
	public int list()
	{
	ArrayList<String> l=new ArrayList<String>();
		l.add("new");
		l.add("old");
		l.add("ty");
		l.add("go");
		l.add("come");
	
	ArrayList<String> l1=new ArrayList<String>();
		l1.add("new");
		l1.add("big");
		l1.add("ne");
		l1.add("newton");
		
	ArrayList<String> l2=new ArrayList<String>();	
		l2.add("brown");
		l2.add("new");
		
	ArrayList<String> l3=new ArrayList<String>();	
	 	l3.add("new");
	 	l3.add("new_india");
	 	l3.add("champion");
	 	l3.add("looser");
	 	
	ArrayList<String> l4=new ArrayList<String>();
		l4.add("new"); 
		l4.add("data");
	l.retainAll(l2);
	l.retainAll(l3);
	l.retainAll(l4);
	l.retainAll(l1);
	System.out.println("common element is = "+l);
	String a=l.get(0);
	int index=l4.indexOf(a);
	System.out.println("index is = "+index);
	return index;
}
}