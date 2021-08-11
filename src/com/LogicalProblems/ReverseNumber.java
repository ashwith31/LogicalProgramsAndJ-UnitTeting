package com.LogicalProblems;
import java.util.Scanner;
/*
 *  Program to reverse a number 
 * @author Ashwith
 */
public class ReverseNumber {
	static int number;
	static int reverse=0;
	static Scanner sc =new Scanner(System.in);
	/*
	 * This method computes and gives the reverse of a number.
	 */
	public static void reverseNumber() {
		System.out.println("Enter the number to be reversed");
		number=sc.nextInt();
		while(number>0){
			int y=number%10;
			reverse=reverse*10+y;
			number=number/10;
		}
		System.out.print(reverse);
	}
	public static void main(String[] args) {
		reverseNumber();
		sc.close();
	}
}
