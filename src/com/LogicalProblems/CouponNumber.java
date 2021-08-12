package com.LogicalProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *  Program to check how many random numbers do you
	need to generate a distinct coupon number.
 * @author Ashwith
 */
public class CouponNumber {
	public static void main(String[] args) {
		// taking input from user
		Scanner sc = new Scanner(System.in);
        System.out.print("How many Coupons You Want to Generate : ");
        int numOfCoupon = sc.nextInt();
        getCoupon(numOfCoupon); 
        sc.close();

         
	}
	/*
	 * This method generates a random coupon and checks
	 * if it already exists or not.
	 */
	 private static void getCoupon(int numOfCoupon) {
		 //count to count the number of times the random coupon is being generated.
		 int count = 0;
	        List<Integer> couponList = new ArrayList<>();
	        for (int i = 0; i < numOfCoupon; i++) {
	            int ranNumber = (int) Math.floor(Math.random()*1000);
	            count++;
	            if (!couponList.contains(ranNumber)) {
	                couponList.add(ranNumber);
	            }
	        }
	        for (int coupon : couponList) {
	            System.out.println(coupon);
	        }
	        System.out.println("Number of turns required to generate Distinct Coupon= " +count);
	 }


}
