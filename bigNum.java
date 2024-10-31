import java.util.Scanner;

public class bigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        big(a,b,c);
        bigger (a,b,c);
    }
    public static void bigger (int a , int b , int c){
      int num=  (a > b && a > c) ? a : (b > a && b > c) ? b :c;
        System.out.println("Biggest number is :"+num);
    }
    public static void  big(int a , int b , int c){
        if (a>b && a>c){
            System.out.println("Big number :"+ a );
        } else if (b>c && b>a) {
            System.out.println("Big number :"+ b);
        }else{
            System.out.println("Big number :"+ c );
        }
    }
}
