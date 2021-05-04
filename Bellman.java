package Greedy;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Bellman {
	public static void main(String[] args)
	{
		ArrayList<ArrayList <Integer>>arr= new ArrayList<ArrayList <Integer>>();
		for(int i=0;i<10;i++)
		{
			arr.add(new ArrayList<Integer>());
		}
		Scanner sc = null;
		try
		{
		sc = new Scanner(new File("graph22.txt"));
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
			arr.get(count).add(Integer.parseInt(a));
			arr.get(count).add(Integer.parseInt(b));
			arr.get(count).add(Integer.parseInt(c));
			count++;
		}
		int dist[] = new int[5]; 
        for (int i = 0; i < 5; ++i) 
            dist[i] = Integer.MAX_VALUE; 
        dist[0] = 0;
        for (int i = 1; i < 5; ++i) { 
            for (int j = 0; j < 8; ++j) { 
                int u = arr.get(j).get(0); 
                int v = arr.get(j).get(1); 
                int weight = arr.get(j).get(2);  
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) 
                    dist[v] = dist[u] + weight; 
            }
            
        }
        System.out.println("Vertex Distance from Source"); 
        for (int i = 0; i < 5; ++i) 
            System.out.println(i + "\t\t" + dist[i]); 
	}

}
