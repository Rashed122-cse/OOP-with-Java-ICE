import java.sql.SQLOutput;
import java.util.Scanner;

class Month {
    int month;
    int year;

    public Month(int month) {
        this.month = month;
    }

    public Month(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int display() {
        if  (month == 2) {
            if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month % 2 == 0) {
            return 30;
        } else {
            return 31;
        }
    }
}

public class daysInmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month : ");
        int month = sc.nextInt();

       if (month == 0){
           System.out.println("It is not a month number ");
       } else if (month > 12 ) {
           System.out.println("It is not a month number ");
       }else{
           if (month == 2) {
               System.out.print("Enter year : ");
               int year = sc.nextInt();
               Month month1 = new Month(month , year);
               System.out.println("Dayes in a month: "+month1.display());
           }else{
               Month month1 = new Month(month);
               System.out.println("Dayes in a month: "+month1.display());

           }
       }
    }
}
