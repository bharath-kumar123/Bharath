package com.bharath.first;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String s=scan.nextLine();
	String[] s1=s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
		String s2="";
		s2=s1[i];
		char[] a=s2.toCharArray();
			char temp;
			temp=a[0];
			a[0]=a[a.length-1];
			a[a.length-1]=temp;
			System.out.print(a);
			System.out.print(" ");
	}
		System.out.print("code changed");
	}
}
