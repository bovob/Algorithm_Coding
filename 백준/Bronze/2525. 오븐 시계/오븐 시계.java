import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int oven = scan.nextInt();

        int result = (60 * hour) + minute + oven;

        int realH = (result / 60) % 24;
        int realM = result % 60;

        System.out.println(realH + " " + realM);

    }
}


