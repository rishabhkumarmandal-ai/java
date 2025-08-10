import java.util.Scanner; // Import Scanner class for user input

// Main class
public class StudentDemo {

    // Main method — the entry point of any Java program
    public static void main(String[] args) {
        
        // 1. VARIABLES & DATA TYPES
        int rollNumber = 101;         // Integer type variable
        String name = "Aman";         // String type variable
        double marks = 87.5;          // Decimal number
        boolean isPass = true;        // Boolean type (true/false)

        // Printing output
        System.out.println("----- Student Info -----");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Pass Status: " + isPass);

        // 2. TAKING USER INPUT
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("\nEnter your age: ");
        int age = sc.nextInt(); // Taking integer input
        sc.nextLine(); // To handle the leftover newline from nextInt
        System.out.print("Enter your favorite subject: ");
        String favSubject = sc.nextLine(); // Taking string input

        System.out.println("You are " + age + " years old and love " + favSubject);

        // 3. OPERATORS EXAMPLE
        int a = 10, b = 3;
        System.out.println("\nOperators Example:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Integer division
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        // 4. CONDITIONAL STATEMENTS
        System.out.println("\nConditional Example:");
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        System.out.println("\nSwitch Case Example:");
        int day = 3; // example of the week
        switch (day) {
            case 1:
                System.out.println(favSubject);
                break;
            case 2:
                System.out.println(favSubject);
                break;
            default:
                System.out.println("No subject for this day.");
                break;
        }


        // 5. LOOPS — For, While, Do-While
        System.out.println("\nFor Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println("\nWhile Loop Example:");
        int count = 1;
        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("\nDo-While Loop Example:");
        int num = 1;
        do {
            System.out.println("Num: " + num);
            num++;
        } while (num <= 2);

        // 6. ARRAY — Storing multiple values
        System.out.println("\nArray Example:");
        int[] scores = {85, 90, 78, 88};
        for (int score : scores) { // Enhanced for loop
            System.out.println("Score: " + score);
        }

        // 7. METHOD CALL — Reusable block of code
        System.out.println("\nMethod Example:");
        greetUser("Ravi"); // Calling a method with an argument

        // 8. OBJECT ORIENTED PROGRAMMING — Class & Object
        System.out.println("\nOOP Example:");
        Student s1 = new Student(102, "Priya", 92.3); // Creating an object
        s1.displayInfo(); // Calling object method

        sc.close(); // Closing the Scanner
    }

    // METHOD — Performs a specific task when called
    public static void greetUser(String username) {
        System.out.println("Hello, " + username + "! Welcome to Java.");
    }
}

// Separate CLASS to demonstrate OOP
class Student {
    int rollNo;
    String name;
    double marks;

    // Constructor — Sets initial values when object is created
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method — Displays student information
    void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
