/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ide
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println(sum);
		
	}
}
