package userinput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //object declaration 
        System.out.println(" Your name Please" ); // enter input from user
        String name= input.nextLine();//taking input from user
        System.out.println("Good Morning " + name);    //  using input from user   
        System.out.println(name + ", also tell me your age");
        int age = input.nextInt();
        System.out.println("Your age is " + age + "years old");

    }

}