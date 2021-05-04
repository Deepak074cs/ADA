package Searching;


class Node
{

		int data;
		Node left;
		Node right;
		Node(int d)	{
			data=d;
		}
}
class Linked1
{
	Node root;
	void insert(int key)  
    {  
         root = insertRec(root, key);  
    }
	public Node insertRec(Node root,int key)
	{
		if(root==null)
		{
			root = new Node(key);
			return root;
		}
		if(root.data > key)
			root.left=insertRec(root.left,key);
		else if(root.data < key)
			root.right=insertRec(root.right,key);
		return root;
		
	}
	
	public Node delete(Node root,int x)
	{
		if(root==null)
		{
		 return null;
		}
		if(root.data<x)
		{
			root.right=delete(root.right,x);
		}
		else if(root.data>x)
		{
			root.left=delete(root.left,x);
		}
		else
			{if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			else
			{   
				Node succ=getSucc(root);
				root.data=succ.data;
				root.right=delete(root.right,succ.data);
			}
		}
		
			 
		return root;
	}
	public Node getSucc(Node root)
	{
		Node curr=root;
		curr=curr.right;
		while(curr!=null && curr.left!=null)
		{
			curr=curr.left;
		}
		return curr;
	}
	

}

public class BinaryInsert {
	public static void main(String[] args)
	{
		Linked1 ll = new Linked1();
		ll.insert(10);
		ll.insert(20);
		ll.insert(5);
		
	}

}
