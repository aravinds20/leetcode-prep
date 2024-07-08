package com.aravind.math;

/*
Problem statement - Reverse a given array of integers.
 */

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 3, 4, 6, 8, 11};
        int[] reversedArray = new int[arr.length];

        //reversing in place.
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }

        System.out.println("\n");
        //reversing in place with recursion.
        reverseArray(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    //reversing the array using a temp variable, in place.
    public static void reverseArray(int[] arr, int start, int end) {
        if(start >=end)
            return;
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, ++start, --end);
    }

}
