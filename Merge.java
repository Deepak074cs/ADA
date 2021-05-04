package Sorting;

public class Merge {

	//DIKSHA N LIKHA
	public static void main(String[] args) {
		int arr[]= {9,2,4,1,10,8};
		int l=0;
		int r=arr.length-1;
		sort(arr,l,r);
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
		public static void sort(int arr[],int l,int r)
		{
			if(l<r)
			{
				int m=l+(r-l)/2;
				sort(arr,l,m);
				sort(arr,m+1,r);
				merge(arr,l,m,r);
			}
		}

		public static void merge(int arr[],int l,int m,int r)
		{
			int n1=m-l+1;
			int n2=r-m;
			int left[]=new int[n1];
			int right[]=new int[n2];
			for(int i=0;i<n1;i++)
			{
				left[i]=arr[l+i];
			}
			for(int i=0;i<n2;i++)
			{
				right[i]=arr[m+1+i];
			}
			int k=l;
			int i=0;
			int j=0;
			while(n1>i && n2>j)
			{
				if(left[i]>right[j])
				{
					arr[k]=right[j];
					j++;
				}
				else
				{
					arr[k]=left[i];
					i++;
				}
				k++;
			}
			while(i<n1)
			{
				arr[k]=left[i];
				i++;
				k++;
			}
			while(j<n2)
			{
				arr[k]=right[j];
				j++;
				k++;
			}
			
		}
		

}
