package com.yq.first;

import java.util.Scanner;

public class Circle {
	
	public Node first;
	public Node last;

	public static void main(String[] args) {
		
		Circle list=new Circle();
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		for(int i=1;i<=N;i++)
		{
			Node node=new Node(i);
			list.add(node);
		}
		int K=scan.nextInt();
		Node no=list.first;
		while(!list.first.equals(list.last))
		{
			int i=1;
			while(i<K)
			{
				i++;
				no=no.next;
			}
			list.del(no);
			no=no.next;
		}
		System.out.println(list.first.num);
		
	}
	
	public void add(Node node)
	{
		if(first==null)
		{
			first=node;
			last=node;
			last.next=first;
		}else
		{
			last.next=node;
			last=node;
			last.next=first;
		}
	}
	
	public void del(Node node)
	{
		if(node.equals(first))
		{
			first=first.next;
			last.next=first;
		}
		else if(node.equals(last))
		{
			Node no=first;
			while(!no.next.equals(last))
			{
				no=no.next;
			}
			last=no;
			last.next=first;
		}
		else
		{
			Node no=first;
			while(!no.next.equals(node))
			{
				no=no.next;
			}
			no.next=node.next;
		}
	}
}
class Node{
	
	public int num;
	public Node next;
	
	public Node(int num)
	{
		this.num=num;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
	
}
