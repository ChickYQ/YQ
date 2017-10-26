package com.yq.first;

import java.util.Scanner;

public class Bash {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			int N=scan.nextInt();
			int K=scan.nextInt();
			if(N%(K+1)!=0)
			{
				arr[i]="A";
			}else
				arr[i]="B";
		}
		for(String a:arr)
		{
			System.out.println(a);
		}
	}
}
