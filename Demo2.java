/*
 * 3) i) Create the following class and implement the method to check whether the given
string is a palindrome and return the result.
Class Name : Demo2
Method : palindromeCheck(String):boolean
(Hint: A String is palindrome, If the reversed string is equal to the actual string.
 Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.
 */

package Day9HandsOn;

public class Demo2 
{
	public boolean palindromeCheck(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		StringBuffer a = sb.reverse();
		
		if(sb.equals(a))
		{
			//System.out.println("t");
			return true;
		}
		else 
		{
			//System.out.println("f");
			return false;
		}
		
	}

}
