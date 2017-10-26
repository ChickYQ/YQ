package com.yq.first;

import java.util.Scanner;
/*
 * N!modP
 */
public class NmodP {
	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int P=scan.nextInt();
		long R=1;
		for(int i=1;i<=N;i++)
		{
			R=((R%P)*(i%P)+P)%P;
		}
		System.out.println(R);

		
		}
}
