
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int hour = 3600 * x;
        int minute = 60 * y ;

        int day = hour + minute - 2700;
        
        if (day > 86400) {
            day -= 86400;
            hour = day / 3600;
            minute = (day - (hour*3600)) / 60;
            System.out.printf("%d %d", hour, minute);
        } else if (day < 0) {
            day *= -1;
            minute = 60 - (day/60);
            System.out.printf("23 %d", minute);
        } else {
            hour = day/3600;
            minute = (day - (hour*3600)) / 60;
            System.out.printf("%d %d",hour, minute);
        }

    }

}