
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < N ; i++){
            int R = scan.nextInt();
            String str = scan.next();
            String[] strArr = str.split("");

            for (int k = 0 ; k < strArr.length ; k++){
                for (int j = 0 ; j < R ; j++) {
                    sb.append(strArr[k]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}