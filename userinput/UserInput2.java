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
    }
}
