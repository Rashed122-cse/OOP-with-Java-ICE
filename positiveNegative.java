import java.util.Scanner;

class Number {
    int number; // Non-private instance variable

    // Constructor to initialize the number
    public Number(int number) {
        this.number = number;
    }

    // Method to display whether the number is positive, negative, or zero
    public void displayNumber() {
        if (number > 0) {
            System.out.println("Number is positive: " + number);
        } else if (number < 0) {
            System.out.println("Number is negative: " + number);
        } else {
            System.out.println("Entered number is zero: " + number);
        }
    }
}

public class positiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Create an instance of Number with user input
        Number numberInstance = new Number(sc.nextInt());

        // Display whether the number is positive, negative, or zero
        numberInstance.displayNumber();
    }
}
