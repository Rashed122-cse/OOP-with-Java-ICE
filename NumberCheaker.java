import java.util.Scanner;
class number {
    float Number;

    public number(float Number) {
        this.Number = Number;
    }

    public void display() {
        if (Number > 0) {
            if (Number > 0 && Number < 1) {
                System.out.println("small positive number ");
            } else if (Number > 1000000) {
                System.out.println("lagge positive number ");
            } else {
                System.out.println("positive number");
            }
        } else if (Number < 0) {
            System.out.println("negative number ");
        } else {
            System.out.println("number is zero");
        }
    }
}
public class NumberCheaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        number Number = new number(sc.nextFloat());
        Number.display();
    }
}

