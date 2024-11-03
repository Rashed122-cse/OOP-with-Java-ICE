import java.util.Scanner;

class Number {
    int number;
    public Number(int number) {
        this.number = number;
    }
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
        Number number = new Number(sc.nextInt());
        number.displayNumber();
    }
}
