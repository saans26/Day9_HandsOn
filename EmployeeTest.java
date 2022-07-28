package Day9HandsOn;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testFindName() 
	{
		ArrayList<String> al = new ArrayList();
		Employee e = new Employee();
		al.add("Sanskruti");
		al.add("Shruti");
		al.add("Samiksha");
		al.add("Vaibhav");
		
		String s = e.findName(al,"Samiksha");
		System.out.println(s);
		s = e.findName(al, "Sans");
		System.out.println(s);
		
	}

}
