package com.bridgelabz.for_loop;

public class ReverseIntegerNumber {

    public static void main(String[] args) {
        ReverseIntegerNumber rev = new ReverseIntegerNumber();
        rev.reverseNumber();
    }

    public void reverseNumber(){
        int rev = 0;
        for(int num = 231; num != 0; num = num / 10){
            int rem = num % 10;
            rev = rev * 10 + rem;
        }
        System.out.println("Reverse number is: " + rev);
    }
}
