import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		int i,flag=0,flag1=0;
		for(i=0;i<ch.length();i++)
		{

			//ch = aString.charAt(i);
                                    //di = aString.charAt(i);

			if(Character.isLetter(ch.charAt(i)))
			{
			   //System.out.println("yes");
			  // continue;
			  flag=1;
		            }
		            else if(Character.isDigit(ch.charAt(i)))
		            {
		            	flag1=1;
		            }
		            else
		            {
		            	flag=0;
		            }
			
		}
		if((flag==1)&&(flag1==1))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	
	}
}
