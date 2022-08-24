package com.example.helloworld;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // generating the random numbers
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        //displaying the random numbers and prompting for an operator
        System.out.println("The first random number is " + num1);
        System.out.println("The second random number is " + num2);
        System.out.println("Please enter an operator (+, *, or -)");

        //receiving user input for operator
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //testing which operator is used and then displaying correct result
        if (Objects.equals(input, "+")) {
            System.out.println(num1 + num2);
            return;
        } else if (Objects.equals(input, "*")) {
            System.out.println(num1 * num2);
            return;
        } else if (Objects.equals(input, "-")) {
            System.out.println(num1 - num2);
            return;
        }

        System.out.println("That's not an operator!");
    }
}
