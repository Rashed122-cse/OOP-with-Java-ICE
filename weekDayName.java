import java.util.Scanner;
class day{
    int number ;

    public day( int number){
        this.number = number ;
    }
    public void display(){
      if(number < 8) {
          switch (number) {
              case 1:
                  System.out.println("Saterday");
                  break;
              case 2:
                  System.out.println("Sunday");
                  break;
              case 3:
                  System.out.println("Monday");
                  break;
              case 4:
                  System.out.println("Tuesday");
                  break;
              case 5:
                  System.out.println("Wednesday");
                  break;
              case 6:
                  System.out.println("Thuseday");
                  break;
              case 7:
                  System.out.println("Friday");
                  break;
          }
      }else{
          System.out.println("The week day number is invalid");
      }

    }
}
public class weekDayName {
    public static void main(String[] args) {

        Scanner dayNum = new Scanner(System.in);
        System.out.print("Enter day number (1-7) : ");
        day dayOfweek = new day(dayNum.nextInt());
        dayOfweek.display();



    }
}
