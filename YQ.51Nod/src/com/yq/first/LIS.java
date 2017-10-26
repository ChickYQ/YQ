package com.yq.first;

import java.util.Scanner;
/*
 * 动态规划之最大子段和
 */
public class LIS {

	private static long max=0;
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		long a[]=new long[scan.nextInt()];
		long b[]=new long[a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextLong();
		}
		b[0]=a[0];
		max=b[0];
		for(int i=1;i<a.length;i++)
		{
			if(b[i-1]>0)
				b[i]=b[i-1]+a[i];
			else
				b[i]=a[i];
			if(max<b[i])
				max=b[i];
		}
		System.out.println(max);
	}
	
}
