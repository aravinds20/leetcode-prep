package com.aravind.math;

/*
Problem statement - Find first and last digits of a number
Following two approaches - divide until num > 10 and get that number and mod to get the final digit.
Second - converting numbers to string and using its library functions.
Ref- https://www.geeksforgeeks.org/find-first-last-digits-number/
 */

public class LastDigit {

    public static void main(String[] args) {
        int num = 33892;
        String numStr = String.valueOf(num);
        System.out.println(getFirstDigit(num)+" - "+getLastDigit(num));
        System.out.println(numStr.charAt(0)+" - "+numStr.charAt(numStr.length()-1));
    }

    public static int getFirstDigit(int num) {
        while (num>10) {
            num /= 10;
        }
        return num;
    }

    public static int getLastDigit(int num) {
        return num%10;
    }
}
