package com.yq.first;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigMul {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		BigDecimal a=new BigDecimal(scan.nextLine());
		System.out.println(a.multiply(new BigDecimal(scan.nextLine())));
	}
}
