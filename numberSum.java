import java.util.Scanner;
class num {
    int number;

    public num(int number) {
        this.number = number;
    }

    public void display() {
        int i;
        int sum = 0;
        for (i = 1; i < number; i++) {
            System.out.print(i + ",");
            sum += i;
        }
        sum+=i ;
        System.out.print(i);
        System.out.println();
        System.out.println( "total sum of number : "+sum);
    }
}
    public class numberSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter number :" );
            num number = new num(sc.nextInt());
            number.display();
        }
    }
