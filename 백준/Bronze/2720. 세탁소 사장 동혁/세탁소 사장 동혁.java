import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int testCase = scan.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        String[] printChange = new String[testCase];
        int[] coins = {25, 10, 5, 1};

        for (int i = 0; i < testCase; i++) {
            int change = scan.nextInt();
            for (int coin : coins) {
                stringBuilder.append(change / coin).append(" ");
                change %= coin;
            }
            printChange[i] = stringBuilder.toString().trim();
            stringBuilder.setLength(0);
        }

        for (int i = 0; i < testCase; i++) {
            System.out.println(printChange[i]);
        }
    }
}