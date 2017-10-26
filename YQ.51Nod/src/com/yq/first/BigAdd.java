package com.yq.first;

import java.math.BigInteger;
import java.util.Scanner;

public class BigAdd {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		BigInteger a=new BigInteger(scan.nextLine());
		System.out.println(a.add(new BigInteger(scan.nextLine())));
		
	}
		
}
