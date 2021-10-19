package com.sapient.trg.util;

public class MyMath {
	
	public static boolean isPerfectNumber(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		if(n==sum) {
			return true;
		}
		return false;
	}
	
	
	public static long factorial(int n) {
		long fact=1;
		while(n>0) {
			fact = fact *n--;
		}
		return fact;
	}
}
