package question7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetqueTest {
	@Test
	public void main() 
	{
		Setque n=new Setque();
		int b=n.show2();
		assertEquals(10,b);
	
	}
}
