package week1.day2;

import com.aventstack.extentreports.model.TestAttributeTestContext;

public class Reverseevenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
		
		String test = "I am a software tester"; 
		String h1="";
		String str[]=test.split(" ");
		String ch1="";
		for(int i=0;i<=str.length-1;i++)
		{
			if(i%2!=0)
			{
				char[] ch=str[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--)
				{
					 System.out.print(ch[j]);
					// System.out.print(str.length);
				}
				
			}
			else {
				System.out.print(" "+str[i]+" ");
			}
		}
}
}


