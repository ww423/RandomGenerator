package cst1201;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RandomGenerator {

    public static void main(String[] args) {
        //TODO: Create a Scanner object to read keyboard input.
        Scanner scanner = new Scanner(System.in);
        
        //TODO: Ask the user a lower and upper bound.
        System.out.print("Enter a lower bound: ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter an upper bound: ");
        int upperBound = scanner.nextInt();
        
        //TODO: Ask the user for the number of random integers to generate.
        System.out.print("Enter the number of random integers to generate: ");
        int numberOfInt = scanner.nextInt();
        
        //TODO: Generate random integers of the desired length and bound.
        Random random = new Random();
        IntStream intStream = random.ints(numberOfInt, lowerBound, upperBound);
        
        System.out.println(intStream);
        
        //TODO: Print the average, max, min, count, and sum of the integers.
    }
}
