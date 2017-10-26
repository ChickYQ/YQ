package com.yq.first;

import java.util.Scanner;
/*
 * 逆序数
 */
public class Merge {

	public static int nums;
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=scan.nextInt();
		}
		merge(a,0,a.length-1);
		System.out.println(nums);
	}
	
	public static void merge(int a[],int p,int r)
	{
		if(p<r)
		{
			int q=(p+r)/2;
			merge(a,p,q);
			merge(a,q+1,r);
			sort(a,p,q,r);
		}
	}
	
	public static void sort(int a[],int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;
		int L[]=new int[n1];
		int R[]=new int[n2];
		int j=0;
		for(int i=p;i<=q;i++)
		{
			L[j++]=a[i];
		}
		j=0;
		for(int i=q+1;i<=r;i++)
		{
			R[j++]=a[i];
		}
		
		int k=p;
		int i=0;
		j=0;
		
		while(i<L.length&&j<R.length)
		{
			if(L[i]>R[j])
			{
				nums+=L.length-i;
				a[k++]=R[j++];
				
			}else if(L[i]<=R[j])
			{
				a[k++]=L[i++];
			}
		}
		if(i<L.length)
		{
			while(i<L.length)
			a[k++]=L[i++];
		}
		
		if(j<R.length)
		{
			while(j<R.length)
			a[k++]=R[j++];
		}
	}
}
