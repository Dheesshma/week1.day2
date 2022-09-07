package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		
		String test= new String("changeme");
		char[] a=test.toCharArray(); 
	
		int n= a.length;
		//char [] b = new char[n-1];
		//System.out.println(n);
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				char b= Character.toUpperCase(a[i]);
				System.out.print(b);
			}
			else
			{
				System.out.print(a[i]);
			}
		}
	}
}
		
		
