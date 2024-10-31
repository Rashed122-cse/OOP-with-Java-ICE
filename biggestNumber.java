import java.util.Scanner ;
class big {
    static int a, b, c;

    public void number(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void disBigNumber() {
        if (a > b && a > c) {
            System.out.println("Big number is :" + a);
        } else if (b > a && b > c) {
            System.out.println("Big number is :" + b);
        } else {
            System.out.println("Big number is :" + c);
        }
    }

}
    public class biggestNumber {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numbers :");
            big.a = sc.nextInt();
            big.b = sc.nextInt();
            big.c = sc.nextInt();
            big.disBigNumber();

        }
    }
