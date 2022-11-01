package com.bridgelabz.while_loop;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        SumOfNNaturalNumbers sn = new SumOfNNaturalNumbers();
        sn.sumOfNumbers(num);
    }

    public void sumOfNumbers(int num){
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
