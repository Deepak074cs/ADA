package Greedy;
public class ActivitySelection {

	public static void main(String[]args)
	{   char event[]= {'a','b','c','d','e'};
		int start[]= {4,0,1,1,3}; 
		int finish[]= {6,2,3,6,4};   
		sort(finish,start,event);
		char result[]=new char[start.length];
		result[0]=event[0];
		int prev=0;
		int count=1;
		for(int i=1;i<result.length;i++)
		{
			if(start[i]>=finish[prev])
			{
				result[count]=event[i];
				prev=i;
				count++;
				
			}
			
		}
		System.out.println("Selected activities:");
		for(int i=0;i<count;i++)
		{
			System.out.println(result[i]);
			
		}
		
		
		
	}
	public static void sort(int[] arr,int[] start,char[] event)
	{
		int temp1=0;
		int temp2=0;
		char temp3=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp1=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp1;
					temp2=start[j];
					start[j]=start[j+1];
					start[j+1]=temp2;
					temp3=event[j];
					event[j]=event[j+1];
					event[j+1]=temp3;
					
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
	}
}
