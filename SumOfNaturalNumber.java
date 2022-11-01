package com.bridgelabz.for_loop;

import java.util.Scanner;
public class SumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        SumOfNaturalNumber sn = new SumOfNaturalNumber();
        sn.sumOfNumbers(num);
    }

    public void sumOfNumbers(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
