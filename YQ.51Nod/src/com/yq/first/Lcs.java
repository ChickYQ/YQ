package com.yq.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lcs {

	
	public static void main(String[] args) throws IOException {
		
		Long a=System.currentTimeMillis();
		
		Scanner scan=new Scanner(System.in);
		System.out.println(lcs(scan.next(),scan.next()));			
		
		Long b=System.currentTimeMillis()-a;
		System.out.println(b);
		
	}
	
	public static String lcs(String a,String b)
	{
		if(a.indexOf(b)>=0)
		{
			return b;
		}
		if(b.indexOf(a)>=0)
		{
			return a;
		}

		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		StringBuffer str=new StringBuffer();
		StringBuffer str2=new StringBuffer();
		int num=0;
		for(int i=0;i<c.length;i++)
		{
			
			for(int j=num;j<d.length;j++)
			{
				if(c[i]==d[j])
				{
					str.append(c[i]);
					num=++j;
					break;
				}
			}
		}
		int num2=0;
		for(int i=0;i<d.length;i++)
		{
			
			for(int j=num2;j<c.length;j++)
			{
				if(d[i]==c[j])
				{
					str2.append(d[i]);
					num2=++j;
					break;
				}
			}
		}
		return str.toString().length()>str2.toString().length()?str.toString():str2.toString();
	}
}
