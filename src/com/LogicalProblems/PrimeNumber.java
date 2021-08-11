package com.LogicalProblems;
import java.util.Scanner;
/*
 *  Program to check if a number is prime or not. 
 * @author Ashwith
 */
public class PrimeNumber {
	static Scanner sc=new Scanner(System.in);
	/*
	 * This is a method where we are checking if a number is prime or not.
	 * The method prints if a number is prime or not. 
	 * @param no parameters
	 * @return no return type
	 */
	public static void checkPrime()
	{
		System.out.println("Enter the number to be checked");
		int value=sc.nextInt();
		int flag=0;
		for(int i=2;i<value/2;i++)
		{
			if(value%i==0)
				flag=1;
		}
		if(flag==0)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is not a Prime Number");
		}
	}

	public static void main(String[] args) {

		checkPrime();
		sc.close();
	}

}
