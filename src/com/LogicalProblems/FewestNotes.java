package com.LogicalProblems;
import java.util.Scanner;
/*
 *  Program to Find the Fewest Notes to be returned for Vending Machine  
 * @author Ashwith
 */
public class FewestNotes {
	static Scanner sc =new Scanner(System.in);
	//count to count the number of notes to be returned
	static int count=0;
	//value is to store amount to be returned 
	static int value;
	/*
	 * This method calculates and prints
	 *  the notes to be returned and returns the number of notes to be returns
	 *  @return count of the number of notes
	 */
	public static int checkNotes(int i){
		while(value/i>0) {
			value=value-i;
			System.out.println(i);
			count++;
		}
		return count;
	}
	/*
	 * This method takes the input from user the amount 
	 * to be returned and prints the total number of notes that are 
	 * to be returned.
	 */
	public static void vender(){
		System.out.println("Please enter the change to be returned:");
		value=sc.nextInt();
		int a[]= {1000,500,100,50,10,5,2,1};
		System.out.println("List of notes are:");
		for(int i=0;i<a.length;i++)
		{
			checkNotes(a[i]);
		}
		System.out.println("Total number of notes= "+count);
	}
	public static void main(String[] args) {
		vender();
	}

}
