package com.learning.pluralsight;

import com.learning.pluralsight.arithematicoperators.basic.BasicOperators;
import com.learning.pluralsight.arithematicoperators.preandpostfix.PreAndPostFix;
import com.learning.pluralsight.primitivedatatypes.DataTypes;
import com.learning.pluralsight.comments.Comments;

/**
 * Basic Hello World Program
 *
 * @Author : Saketh Kamatham
 */
public class HelloWorld {


    public static void main(String[] args) {
        Comments comments = new Comments();
        DataTypes dataTypes = new DataTypes();
        BasicOperators basicOperators = new BasicOperators();
        PreAndPostFix preAndPostFix = new PreAndPostFix();

        System.out.println("Hello !! This is Java 17 Fundamentals\n");
        System.out.println("I - Java Comments\n");
        comments.LineComment();
        comments.BlockComment();
        comments.JavaDocComment();
        System.out.println("II - Primitive Datatypes.\n");
        dataTypes.dataTypes();
        System.out.println("III - Basic Operators\n");
        basicOperators.basicOperators();
        System.out.println("IV - Prefix and Postfix Operators\n");
        preAndPostFix.preAndPostFix();
    }

}