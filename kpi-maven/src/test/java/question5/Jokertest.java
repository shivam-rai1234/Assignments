package question5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Jokertest {
	@Test
	public void tryout()
	{
		Joker j=new Joker("Joker1","kathakli");
		Joker j1=new Joker("Joker5","Bhangda");
		assertEquals("kathakli",j.dance);
		assertEquals("Bhangda",j1.dance);
		
		
	}

	
	
}
