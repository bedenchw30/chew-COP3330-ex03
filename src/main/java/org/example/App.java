package org.example;

import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
public class App {
    public static void main( String[] args){
        System.out.print("What is the quote? ");

        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String author = input.nextLine();


        System.out.println(author + " says, " + '"'+ quote + '"');





    }
}