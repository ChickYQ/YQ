package com.yq.first;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int e:arr)
			System.out.println(e);
	}
}
