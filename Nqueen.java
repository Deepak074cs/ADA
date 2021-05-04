package Backtracking;

public class Nqueen {

public static void main(String[] args)
{
	int[] sol = new int[4];
	int board[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	if(nqueen(board,0,sol)==false)
	{
		System.out.println("Solution does not exist!!");
	}
	else
	{
		printQueen(sol);
	}	
}
public static boolean nqueen(int[][] board , int col , int[] sol)
{
	if(col>=4)
	{
		return true;
	}
	
	for(int i=0;i<4;i++)
	{
		if(valid(board , i , col))
		{
			board[i][col]=1;
			sol[i]=col;
			if(nqueen(board , col+1 , sol)==true)
				return true;
			board[i][col]=0;
			sol[i]=0;
		}
	}
	return false;
}
public static boolean valid(int[][] board , int row , int col)
{
	int i , j ;
	for( i=0;i<col;i++)
	{
		if(board[row][i]==1)
			return false;
	}
	for(i=row ,j = col ; i>=0 && j>=0 ;i--,j--)
	{
		if(board[i][j]==1)
			return false;
	}
	for (i = row, j = col; j >= 0 && i<4; i++, j--)
        if (board[i][j] == 1)
            return false;
	return true;
}
public static void printQueen(int[] sol)
{
	for(int i=0;i<sol.length;i++)
	{
		System.out.print(sol[i]+1 + " ");
	}
}
}
