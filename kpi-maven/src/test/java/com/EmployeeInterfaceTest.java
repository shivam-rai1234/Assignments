package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeInterfaceTest {
	@Test
	public void evaluatesExpression() 
	{
		Abhishek n1=new Abhishek();
		Abhishek n2=new Abhishek();
		
		Abhitayu n3=new Abhitayu();
		Abhitayu n4=new Abhitayu();
		
		Akshit n5=new Akshit();
		Akshit n6=new Akshit();
		
		Mushruf n7=new Mushruf();
		Mushruf n8=new Mushruf();
		
		Nirata n9=new Nirata();
		Nirata n10=new Nirata();
		
		Om n11=new Om();
		Om n12=new Om();
		
		Sheetal n13=new Sheetal();
		Sheetal n14=new Sheetal();
		
		Shubham n15=new Shubham();
		Shubham n16=new Shubham();
		
		String m1=n1.f_name();
		String m2=n2.bank_name();
		
		String m3=n3.f_name();
		String m4=n4.bank_name();
		
		String m5=n5.f_name();
		String m6=n6.bank_name();
		
		String m7=n7.f_name();
		String m8=n8.bank_name();
		
		String m9=n9.f_name();
		String m10=n10.bank_name();
		
		String m11=n11.f_name();
		String m12=n12.bank_name();
		
		String m13=n13.f_name();
		String m14=n14.bank_name();
		
		String m15=n15.f_name();
		String m16=n16.bank_name();
		
		assertEquals("Abhishek",m1);
		assertEquals("Axis Bank",m2);
		assertEquals("Abhitayu",m3);
		assertEquals("Axis bank",m4);
		assertEquals("Akshit",m5);
		assertEquals("Axis bank",m6);
		assertEquals("Mushruf",m7);
		assertEquals("Axis Bank",m8);
		assertEquals("Nirata",m9);
		assertEquals("Axis Bank",m10);
		assertEquals("Om",m11);
		assertEquals("Axis Bank",m12);
		assertEquals("Sheetal",m13);
		assertEquals("Axis Bank",m14);
		assertEquals("Shubham",m15);
		assertEquals("Axis Bank",m16);
		
		
		
		
		
		
		
		
	}
}
