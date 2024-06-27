package com.aravind.math;


/*
Problem statement - Find even or odd
Solution - We all know even numbers have zero as the last bit and odd have one as the last bit.
When we bitwise right shift any number then the last bit of the number piped out whenever it is even or odd.
Next, we did a bitwise left shift, then our bit shifted by one.
Now last bit placed is empty which is by default filled by a zero.
During all these odd numbers changed their value but even remains the same.
 */
public class EvenOrOdd {

    public static void main(String[] args) {

        //Performing bitwise shift
        // 8421
        // 1000 becomes on left shift -
        // 0100 becomes on right shift -
        // 1000 because the last bit is always empty -i.e., 0.
        int num = 8;
        if((num>>1)<<1 == num){
            System.out.println("number is even");
        }
        else
            System.out.println("number is odd");
    }

}
