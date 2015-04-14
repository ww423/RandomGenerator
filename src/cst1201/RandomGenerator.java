package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
        int max = 0;
        int sum = 0;
        int min = 0;
        double average = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter an upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.print("Enter the number of random integers to generate: ");
        int count = scanner.nextInt();

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int num = random.nextInt(upperBound - lowerBound) + 1 + lowerBound;
            System.out.println("The random number generated is: " + num);

            max = num >= max ? num : max;
            min = num <= min || min == 0 ? num : min;
            sum += num;
            average += num;
        }
        average = average / count;

        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }
}
