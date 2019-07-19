package com.ebox;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));
	}
	
	public static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
