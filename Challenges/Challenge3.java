package Challenges;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the Calculator ");
        System.out.println("Pleaase enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Please enter your second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(" Sum of the number is : " + sum);
    }
}
