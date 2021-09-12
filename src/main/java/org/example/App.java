package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
        public static void main(String[] args) {

            System.out.print("What is the quote? ");

            Scanner input = new Scanner(System.in);
            String x = input.nextLine();

            System.out.print("Who said it? ");
            String y = input.nextLine();

            System.out.println(y + " says, " +'"'+ x +'"');

        }
}