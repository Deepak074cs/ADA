package Dynamic;

public class MultiStages {
	public static void main(String[] args)
	{
		int stages=4;
		int n=8;
		int[] cost = new int[9];
		int[] dist = new int[9];
		int[] path = new int[5];
		int[][] c = {{0,0,0,0,0,0,0,0,0},{0,0,2,1,3,0,0,0,0},{0,0,0,0,0,2,3,0,0},{0,0,0,0,0,6,7,0,0}
		,{0,0,0,0,0,6,8,9,0},{0,0,0,0,0,0,0,0,6},{0,0,0,0,0,0,0,0,4},
		{0,0,0,0,0,0,0,0,5},{0,0,0,0,0,0,0,0,0}};
		cost[n]=0;
		int min=Integer.MAX_VALUE;
		for(int i=n-1;i>=1;i--)
		{
			min=Integer.MAX_VALUE;
			for(int k=i+1;k<=n;k++)
			{
				if(c[i][k]!=0 && c[i][k]+cost[k]<min)
				{
					min=c[i][k]+cost[k];
					dist[i]=k;
				}
			}
			cost[i]=min;
		}
		path[1]=1;
		path[stages]=n;
		for(int i=2;i<stages;i++)
		{
			path[i]=dist[path[i-1]];
		}
		for(int i=1;i<stages+1;i++)
		{
			System.out.println(path[i]);
		}
	}

}
