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

	private static boolean isPrime(int num) {
		if (num % 2 == 0) return false;
		for (int i = 3; i * i < num; i += 2)
			if (num % i == 0) return false;
		return true;
	}

	static int sumOfPrimes(int n)
	{
		boolean prime[]=new boolean[n + 1];
		Arrays.fill(prime, true);

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}
		int sum = 0;
		for (int i = 2; i <= n; i++)
			if (prime[i])
				sum += i;
		return sum;
	}
	public static boolean isArmstrong(int n) {
		int no_of_digits = String.valueOf(n).length();
		int sum = 0;
		int value = n;
		for(int i=1;i<=no_of_digits;i++) {
			int digit = value%10;
			value = value/10;
			sum = sum + (int)Math.pow(digit, no_of_digits);
		}
		if(sum == n) {
			return true;
		}else {
			return false;
		}
	}
	   public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);
	       }
	   }
	   
}
