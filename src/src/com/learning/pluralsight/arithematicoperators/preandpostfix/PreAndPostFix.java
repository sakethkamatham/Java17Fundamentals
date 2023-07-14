package com.learning.pluralsight.arithematicoperators.preandpostfix;

/**
 * This class gives details about the prefix and postfix Operators
 */
public class PreAndPostFix {

    public void preAndPostFix(){
        int someValue = 5;
        System.out.println(" ++  --\n");
        System.out.println("Initial Value is: "+someValue);
        System.out.println("Prefix : "+(++someValue));
        System.out.println("Prefix After Value : \n"+someValue);
        System.out.println("Postfix : "+(someValue++));
        System.out.println("Prefix After Value : \n"+someValue);
    }
}
