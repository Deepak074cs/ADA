package Greedy;

public class JobSequence {
	public static void main(String[] args)
	{
		int[] profit = {};
		int[] deadlines= {1,1,1};  
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<deadlines.length;i++)
		{
 			if(deadlines[i]>temp)
			{
				temp=deadlines[i];
			}
		}
		int[] ratio = new int[temp];
		for(int i=0;i<ratio.length;i++)
		{
			ratio[i]=-1;
		}
		for(int i=0 ; i<deadlines.length ;i++)
		{
			for(int j=deadlines[i]-1;j>=0;j--)
			{
				if(ratio[j]==-1)
				{
					ratio[j]=i;
					break;
				}
			}
			
		}
		int sum=0;
		for(int i=0;i<ratio.length;i++)
		{
			sum=sum+profit[ratio[i]];

		}
		System.out.println(" Total Profit = " +sum);
				
	}

}
