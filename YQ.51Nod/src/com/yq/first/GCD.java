package com.yq.first;

import java.util.Scanner;

public class GCD {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
	    System.out.println(gcd(a,b));
		
	}
	
	public static int gcd(int a,int b)
	{
		if(a<b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		
		if(a==1&&b==1)
		{
			return 1;
		}
		if(a%b!=0)
		{
			return gcd(b,a%b);
		}else
		{
			return b;
		}
	}
	
}
