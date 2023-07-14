package com.learning.pluralsight.myfirstprogram;

import com.learning.pluralsight.comments.Comments;

/**
 * Basic Hello World Program
 *
 * @Author : Saketh Kamatham
 */
public class HelloWorld {

     static Comments comments = new Comments();
    public static void main(String[] args) {
        helloWorld();
        commentDemo();
    }

    public static void helloWorld(){
        System.out.println("Hello world!");
    }

    public static void commentDemo(){
        comments.LineComment();
        comments.BlockComment();
        comments.JavaDocComment();
    }
}