package com.bridgelabz.ifelse_statement;

import java.util.Scanner;

public class ReadNumberDisplayUnitDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        ReadNumberDisplayUnitDigit rd = new ReadNumberDisplayUnitDigit();
        rd.displayUnitDigit(num);
    }
    public void displayUnitDigit(int num) {
        if( num == 1) {
            System.out.println("Unit");
        }
        else if(num == 10) {
            System.out.println("Ten");
        }
        else if(num == 100) {
            System.out.println("Hundred");
        }
        else if(num == 1000) {
            System.out.println("Thousand");
        }
        else {
            System.out.println("Enter Valid Unit(1, 10, 100 and 1000)");
        }

    }
}
