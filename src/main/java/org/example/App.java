package org.example;

import java.util.Scanner;

import org.example.Calculator.Calculator;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char expression;
        System.out.println("Enter First Number : ");
        a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        b = sc.nextInt();
        System.out.println("Enter Operation you want to perform : ");
        expression = sc.next().charAt(0);

        Calculator calculator = new Calculator();
        double result = calculator.performOperations(a,b,expression);
        System.out.println("Result : " + result);
    }
}
