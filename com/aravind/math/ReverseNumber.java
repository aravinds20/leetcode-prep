package com.aravind.math;


/*
Problem statement - reverse a number.
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int num = 123456;
        int reverseNumber = 0;
        while(num != 0) {
            int remainder = num%10;
            reverseNumber = reverseNumber * 10 +remainder;
            num = num/10;
        }
        System.out.println(reverseNumber);
    }

}
