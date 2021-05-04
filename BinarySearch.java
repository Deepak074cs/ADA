package Searching;
import java.util.*;
public class BinarySearch 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6};
		int l=0;
		int r=arr.length-1;
		Scanner n=new Scanner(System.in);
		int x=n.nextInt();
		if(search(arr,l,r,x)==-1)
		{
			System.out.println("not present");
		}
		else
			System.out.println("present");
		
		
	}
	public static int search(int arr[],int l,int r,int x)
	{   
		if(r>=l) 
		{
		int m=(l+r)/2;
		
		if(arr[m]==x)
		{
			return m;
		}
		if(arr[m]>x)
		{
			search(arr,l,m-1,x);
		}
		else
			search(arr,m+1,r,x);
		}
		return -1;
		
	}
	

}
