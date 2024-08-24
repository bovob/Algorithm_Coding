
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split("");

        int i = scan.nextInt()-1;

        System.out.println(str[i]);

    }

}