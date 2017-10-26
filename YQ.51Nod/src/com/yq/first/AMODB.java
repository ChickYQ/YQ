package com.yq.first;

import java.util.Scanner;

public class AMODB {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		long c=scan.nextLong();
		long res=1;
		//System.out.println(mod(a,b,c));
		while(b>0)
		{
			if(b%2==1)
				res=res*a%c;
			a=a*a%c;
			b=b/2;
		}
		System.out.println(res);
	}
	
	public static long mod(long a,long b,long c)
	{
		if(b==1)
			return a%c;
		long temp=mod(a,b/2,c);
		if(b%2==1)
		{
			return temp*temp%c*a%c;
		}
		else
			return temp*temp%c;
	}
}
