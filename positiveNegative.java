import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number :");

        int Number = num.nextInt() ;

        if (Number > 0 ){
            System.out.println("Number is positive ");
        }else{
            System.out.println("number is negative ");
        }
    }
}
