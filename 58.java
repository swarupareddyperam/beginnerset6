/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ide
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[],i;
		a=new int[n];
		int count=0;
		int k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==k)
			{
                                     count=1;
			}
		}
			if(count==1)
			{
				System.out.println("yes");
				//break;
			}
			else
			{
				System.out.println("no");
			}
	}
}
