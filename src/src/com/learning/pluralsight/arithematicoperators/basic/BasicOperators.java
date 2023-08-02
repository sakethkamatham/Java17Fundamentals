package com.learning.pluralsight.arithematicoperators.basic;

/**
 * This class talks about basic operators
 *
 * @Author Saketh Kamatham
 */
public class BasicOperators {

    public void basicOperators(){
        float valueOne = 10;
        float valueTwo = 22;
        int valueThree = 10;
        int valueFour = 22;
        System.out.println("Basic Operators are Addition (+) ; Subtraction (-) ; Multiplication (*) ; Division (/) ; Modulo Division (%)");
        System.out.println("The Floating Values are 10 and 22\n");
        System.out.println("Floating Addition: "+(valueOne+valueTwo));
        System.out.println("Floating Subtraction: "+(valueOne-valueTwo));
        System.out.println("Floating Multiplication: "+(valueOne*valueTwo));
        System.out.println("Floating Division: "+(valueOne/valueTwo));
        System.out.println("Floating Modulo: "+(valueOne%valueTwo));
        System.out.println("\n");
        System.out.println("The Integer Values are 10 and 22\n");
        System.out.println("Integer Addition: "+(valueThree+valueFour));
        System.out.println("Integer Subtraction: "+(valueThree-valueFour));
        System.out.println("Integer Multiplication: "+(valueThree*valueFour));
        System.out.println("Integer Division: "+(valueThree / valueFour));
        System.out.println("Integer Modulo: "+(valueThree%valueFour));

    }
}
