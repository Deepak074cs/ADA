package Sorting;

public class Selection {
	 public static void main(String[]args)
	 {
		 int min,temp=0;
		 int arr[]= {10,2,4,20,30,12,14};
		 for(int i=0;i<arr.length;i++)
		 {
			 min=i;
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[j]<arr[min])
				 {
					 min=j;
				 }
			 }
			 temp=arr[i];
			 arr[i]=arr[min];
			 arr[min]=temp;
				 
		 }
		 for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		 
	 }

}
