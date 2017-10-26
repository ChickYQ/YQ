package com.yq.first;

public class trst {

	public static void main(String[] args) {
		
		String a="abcdead";
		String b="eadabcd";
		a.concat(a);
		a=a+a;
		System.out.println(a.concat(a).indexOf(b));
	}
}
