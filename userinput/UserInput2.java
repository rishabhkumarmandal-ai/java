package userinput;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String args[]){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter youur age: ");
        int age = inputScanner.nextInt();
        System.out.println("Your age is:" + age);
        System.out.println("Enter your height in cm:");
        float height = inputScanner.nextInt();
        System.out.println("Your height is:" + height + " cm");
        System.out.println("Enter your weight in kg:");
        float weight = inputScanner.nextFloat();
        System.out.println("your weight is:" + weight + "kg");
        System.out.println("Enter your ");

        // BMI Calculation
        float heightM = heightCm / 100; // convert cm to meters
        float bmi = weight / (heightM * heightM);

        // Display BMI
        System.out.println("Your BMI is: " + bmi);

        // Optional: Display BMI Category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        inputScanner.close(); // closing scanner
    }
}

