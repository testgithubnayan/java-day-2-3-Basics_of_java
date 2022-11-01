package com.bridgelabz.while_loop;

public class ReverseNumber {

    public static void main(String[] args) {
        ReverseNumber rev = new ReverseNumber();
        rev.reverseIntegerNumber();
    }

    public void reverseIntegerNumber(){
        int num = 231, rev = 0;
        while(num != 0){
           int rem = num % 10;
           rev = rev * 10 + rem;
           num = num / 10;
        }
        System.out.println("Reverse number is: " + rev);
    }
}
