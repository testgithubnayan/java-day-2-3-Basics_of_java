package com.bridgelabz.for_loop;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        pn.checkPalindromeNumber();

    }
    public void checkPalindromeNumber(){
        int r,sum = 0,temp;
        int n = 121;
        temp = n;
        for(; n > 0; n = n / 10){
            r = n % 10;
            sum = (sum * 10) + r;
        }
        if(temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome number");
    }
}
