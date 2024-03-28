package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        float num1 = sc.nextFloat();
        System.out.println("operation('+', '-', '*', '/'): ");
        char operation = sc.next().charAt(0);
        System.out.println("Second number: ");
        float num2 = sc.nextFloat();

        if (operation =='+') {
            float result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if(operation =='-') {
            float result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = "+ result);
        } else if(operation =='*') {
            float result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if(operation =='/') {
            float result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        } else {
           System.out.println("Неправильно ведено!!!");
        }
    }
}