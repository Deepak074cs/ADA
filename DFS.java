package Greedy;
import java.util.*;
import java.io.*;
public class DFS {
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(5);
		for(int i=0;i<5;i++)
		{
			arr.add(new ArrayList<Integer>());
		}
		Scanner sc = null;
		try
		{
		sc = new Scanner(new File("graph12.txt"));
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
		
		boolean[] visited = new boolean[5];
		System.out.print("DFS -> ");
		depth(arr,0,visited);	
		sc.close();
	}
	public static void addEdge(ArrayList<ArrayList<Integer>> arr,int x,int y)
	{
		arr.get(x).add(y);
	}
	public static void depth(ArrayList<ArrayList<Integer>> arr,int s,boolean[] visited)
	{
		visited[s]=true;
		System.out.print(s + " ");
		for(int i:arr.get(s))
		{
			if(visited[i]==false)
			{
				depth(arr,i,visited);
			}
		}		
	}
}
