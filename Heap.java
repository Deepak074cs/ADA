package Sorting;

public class Heap {

	public static void main (String[] args)
	{
		int[] arr= {2,1,7,3,5,4};
		int n=arr.length;
		heapSort(arr,n);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void heapSort(int[] arr,int n)
	{
		buildHeap(arr,n);
		for(int i=n-1;i>=0;i--)
		{
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0]=temp;
			maxHeap(arr,0,i);
		}
	}
	public static void buildHeap(int[] arr,int n)
	{
		for(int i=(n-2)/2;i>=0;i--)
		{
			maxHeap(arr,i,n);
		}
	}
	public static void maxHeap(int[] arr,int i,int n)
	{
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[largest])
			largest=l;
		if(r<n && arr[r]>arr[largest])
			largest=r;
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			maxHeap(arr,largest,n);
		}
	}
	

}
