import java.util.Scanner;

class Number {
    static int number;

    public Number(int n) {
       this.number = n;
    }


    public static void displayNumber() {
        if (number > 0) {
            System.out.println("number is positive :" );
        } else if (number <0) {
            System.out.println("number is negative : " );
        }else{
            System.out.println("enter number is :" + number );
        }
    }
}

public class positiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter number ");
        Number.number = sc.nextInt();
        Number.displayNumber();


    }
}
