package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
			//Build a logic to find the given string is palindrome or not
		     
			/*
			 * Pseudo Code
			
			 * a) Declare A String value as"madam"
			 
			 * b) Declare another String rev value as ""
			 * c) Iterate over the String in reverse order
			 * d) Add the char into rev
			 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
			 
			 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
			 */

		
		// TODO Auto-generated method stub

		String a=new String("madam");
		String b=new String();
		char[] ch=new char[5];
		String h= new String();
			int v=a.length();
			//System.out.println(v);
			for(int i=v-1;i>=0;i--)
			{
				
			
				h=h+a.charAt(i);
			
			
			System.out.println(h);
			
			if(a.equals(h))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a Palindrome");
			}
			}
	}
	}
		
		
	


