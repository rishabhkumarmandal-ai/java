package userinput;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String args[]){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter youur age: ");
        int age = inputScanner.nextInt();
        System.out.println("Your age is:" + age);
    }
}
