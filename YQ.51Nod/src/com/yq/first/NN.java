package com.yq.first;

import java.math.BigDecimal;
import java.util.Scanner;
/*
 * 斯特林公式
 */
public class NN {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		long len=(long)(Math.log10(Math.sqrt(2*Math.PI*N))+N*Math.log10(N/Math.E))+1;
		System.out.println(len);
	}
}
