package question6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraylistTest {
	@Test
	public void  check() 
	{
		Arraylist l=new Arraylist();
		int b=l.list();
		assertEquals(0,b);
	}

}
