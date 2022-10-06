package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeAbstractTest {
	@Test
	public void evaluatesExpression() 
	{
		Akanksha n1=new Akanksha();
		Akanksha n2=new Akanksha();
		
		Anam_tamboli n3=new Anam_tamboli();
		Anam_tamboli n4=new Anam_tamboli();
		
		Mashir n5=new Mashir();
		Mashir n6=new Mashir();
		
		Nidheshree n7=new Nidheshree();
		Nidheshree n8=new Nidheshree();
		
		Payal_pitale n9=new Payal_pitale();
		Payal_pitale n10=new Payal_pitale();
		
		Saksham n11=new Saksham();
		Saksham n12=new Saksham();
		
		Saynam n13=new Saynam();
		Saynam n14=new Saynam();
		
		Shivam_rai n15=new Shivam_rai();
		Shivam_rai n16=new Shivam_rai();
		
		Vaishnavi n17=new Vaishnavi();
		Vaishnavi n18=new Vaishnavi();
		
		Vrishali n19=new Vrishali();
		Vrishali n20=new Vrishali();
		
		int m1=n1.id();
		int m2=n2.roll_no();
		
		int m3=n3.id();
		int m4=n4.roll_no();
		
		int m5=n5.id();
		int m6=n6.roll_no();
		
		int m7=n7.id();
		int m8=n8.roll_no();
		
		int m9=n9.id();
		int m10=n10.roll_no();
		
		int m11=n11.id();
		int m12=n12.roll_no();
		
		int m13=n13.id();
		int m14=n14.roll_no();
		
		int m15=n15.id();
		int m16=n16.roll_no();
		
		int m17=n17.id();
		int m18=n18.roll_no();
		
		int m19=n19.id();
		int m20=n20.roll_no();
		
		assertEquals(1-1,m1);
		assertEquals(1,m2);
		assertEquals(1-2,m3);
		assertEquals(2,m4);
		assertEquals(1-3,m5);
		assertEquals(3,m6);
		assertEquals(1-4,m7);
		assertEquals(4,m8);
		assertEquals(1-5,m9);
		assertEquals(5,m10);
		assertEquals(1-6,m11);
		assertEquals(6,m12);
		assertEquals(1-7,m13);
		assertEquals(7,m14);
		assertEquals(1-8,m15);
		assertEquals(8,m16);
		assertEquals(1-9,m17);
		assertEquals(9,m18);
		assertEquals(1-10,m19);
		assertEquals(10,m20);
		
		
		
		
	}

}
