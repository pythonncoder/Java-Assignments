/*41. Write a program to check whether two given Arrays are equal, given both
contain the same data type and same length */
/*
class As41{
public static void main(String []args){
int[] a = {12,13,24};
int[] b = {13,12,24};

for (int i=0;i<=a.length;i++)
{
	for (int j=0;j<=b.length;j++)
	{
		if (a[i] == b[j]) 
		{
			return;
		}
		else
		{
			return;
		}
	}
}
}
}

*/


import java.io.*; 
import java.util.*;
class As41
{
	public static boolean arequal(int arr1[],int arr2[])
	{
		int n = arr1.length;
		int m = arr2.length;
		
		if (n == m)
		{
			return true;
		}
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		for (int i=0;i<=n;i++)
		{
			if (arr1[i] == arr2[i])
			{
				return true;
			}
		}
	}
	
public static void main(String[] args)
{
		int arr1[] = {3,55,6,7,6};
		int arr2[] = {55,6,6,7,3};
		
		if (arequal(arr1,arr2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		
}
		
}