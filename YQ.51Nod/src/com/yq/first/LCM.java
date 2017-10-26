package com.yq.first;

import java.util.Scanner;

public class LCM {

public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		long c=a*b/gcd(a,b);
	    System.out.println(c);
		
	}
	
	public static long gcd(long a,long b)
	{
		if(a<b)
		{
			long temp=a;
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
