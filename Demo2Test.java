package Day9HandsOn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {

	@Test
	void testPalindromeCheck() 
	{
		Demo2 ob = new Demo2();
		boolean b = ob.palindromeCheck("madam");
		System.out.println(b);
	}

}
