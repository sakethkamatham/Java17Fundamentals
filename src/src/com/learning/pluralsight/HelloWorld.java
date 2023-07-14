package com.learning.pluralsight;

import com.learning.pluralsight.PrimitiveDataTypes.DataTypes;
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

        System.out.println("Hello !! This is Java 17 Fundamentals\n");
        System.out.println("I - Java Comments\n");
        comments.LineComment();
        comments.BlockComment();
        comments.JavaDocComment();
        System.out.println("II - Primitive Datatypes.\n");
        dataTypes.dataTypes();
    }

}