import java.util.Scanner;


class LeapYear {
    int year ;
    public LeapYear(int year) {
        this.year = year;
    }
    public void displayYear() {
        if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 !=0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");

        LeapYear year = new LeapYear(sc.nextInt());
        year.displayYear();
    }
}


