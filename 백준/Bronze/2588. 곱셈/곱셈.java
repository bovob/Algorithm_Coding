import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        String str = String.valueOf(B);
        String[] strArr = str.split("");

        for (int i = 0 ; i < strArr.length ; i++){
            int tmp = 0;
            tmp = Integer.parseInt(strArr[2-i]);
            System.out.println(tmp*A);
        }

        System.out.println(A*B);

        scan.close();
    }
}
