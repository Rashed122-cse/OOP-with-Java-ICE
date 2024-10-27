
import java.util.Scanner;

public class Rashed {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in) ;
        int Number = number.nextInt() ;
        System.out.println("Enter number :" + Number );
        if (Number > 0) {
            System.out.println(Number + " Enter number is positive");

            int counter = 0;
            int Sum = 0;
            while (Number > 0) {
                int remender = 0;
                 remender = Number % 10;
                 Sum += remender;
                 Number = Number / 10 ;
                counter++;
            }
            System.out.println("Sum of number :" + Sum);
            System.out.println("Total digite of numbers :" + counter);
        }else{
            System.out.println("Enter number is negative :" + Number );
        }
    }
}
