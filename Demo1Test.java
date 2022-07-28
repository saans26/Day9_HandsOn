package Day9HandsOn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() 
	{
		Demo1 ob = new Demo1();
		String s = ob.stringConcat("Sanskruti ", "Jalte");
		assertEquals("Sanskruti Jalte", s);
		//System.out.println(s+" g");
	}

}
