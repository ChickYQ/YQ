package com.yq.first;

import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result=arr[0];
		for(int i=0;i<n-1;i++)
		{
			result=result^arr[i+1];
		}
		if(result==0)
		{
			System.out.println("B");
		}else
			System.out.println("A");
	}
}
