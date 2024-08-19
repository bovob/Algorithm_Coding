import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String[] strArray = str.split(" ");

        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);

        if (a == b) {
            System.out.println("==");
        } else if (a < b) {
            System.out.println("<");
        } else if (a > b) {
            System.out.println(">");

        }
    }
}
