package Greedy;
import java.io.File;
import java.util.*;
public class BreadthFirstSearch 
{
	public static void main(String[]args)
	{
		ArrayList<ArrayList <Integer>>arr= new ArrayList<ArrayList <Integer>>(5);
		for(int i=0;i<5;i++)
		{
			arr.add(new ArrayList<Integer>());
		}
		Scanner sc = null;
		try
		{
		sc = new Scanner(new File("graph21.txt"));
		}
		catch(Exception e)
		{
			System.out.println("File Not Found");
		}
		int count=0;
		while(sc.hasNext())
		{
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			String d = sc.next();
			String e = sc.next();
			if(Integer.parseInt(a)==1)
			{
				addEdge(arr,count,0);
			}
			if(Integer.parseInt(b)==1)
			{
				addEdge(arr,count,1);
			}
			if(Integer.parseInt(c)==1)
			{
				addEdge(arr,count,2);
			}
			if(Integer.parseInt(d)==1)
			{
				addEdge(arr,count,3);
			}
			if(Integer.parseInt(e)==1)
			{
				addEdge(arr,count,4);
			}	
			count++;
		}
		System.out.print("BFS -> ");
		bfs(arr,4,0);
		
	}
	public static void addEdge(ArrayList<ArrayList <Integer>>arr,int x,int y)
	{
		arr.get(x).add(y);
		arr.get(y).add(x);
	}
	public static void bfs(ArrayList<ArrayList <Integer>> arr,int v ,int s)
	{
		boolean visited[] =new boolean[v+1];
		Queue <Integer> q =new LinkedList<>();
		visited[s]=true;
		q.add(s);
		while(q.isEmpty()==false)
		{
			int u = q.poll();
			System.out.print(u + " ");
			for(int i:arr.get(u))
			{
			if(visited[i]==false)
			{
				visited[i]=true;
				q.add(i);	
			}
			}
		}
		
	}

}
