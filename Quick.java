package Sorting;

public class Quick {
	public static void main(String[] args)
	{
		int[]arr= {3,2,7,10,1,9};
		int l=0;
		int h=arr.length-1;
		quickSort(arr,l,h);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		}
	public static void quickSort(int arr[],int l, int h)
	{
		if(h>l)
		{   
			int p=partition(arr,l,h);
			quickSort(arr,l,p-1);
			quickSort(arr,p+1,h);					
		}
		
	}
	public static int partition(int arr[],int l,int h)
	{
		int pivot=arr[h];                               
		int i=l-1;
		for(int j=l;j<=h-1;j++)
		{
			if(arr[j]<pivot)
			{   
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp1=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp1;
		
		return i+1;
	}

	

}