package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text = "We learn basics as part of java sessions in java week1";		
		int count=0;
		String[] text1=text.split(" ");
		int a=text1.length;
		//System.out.println(a);
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(text1[i].equals(text1[j]))
				{
					count=count+1;
					text1[j]=" ";
					System.out.println(text1[j]);
					
				}
				
			}
			
		}
		if(count>0)
		{
			for(int k=0;k<a;k++)
			{
				System.out.print(text1[k]+" ");
			}
		}
		
		
		
		
		
		
		

}
}
