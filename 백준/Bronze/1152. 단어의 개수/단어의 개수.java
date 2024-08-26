
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine().trim();
        StringTokenizer st = new StringTokenizer(str);

        System.out.println(st.countTokens());
    }
}