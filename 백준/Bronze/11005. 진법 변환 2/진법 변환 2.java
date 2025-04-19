import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String input = scan.nextLine();
        String[] parts = input.split(" ");

        int number = Integer.parseInt(parts[0]);
        int base = Integer.parseInt(parts[1]);

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % base;

            if (remainder < 10) {
                result.append((char) (remainder + '0'));
            } else {
                result.append((char) (remainder - 10 + 'A'));
            }

            number /= base;
        }

        System.out.println(result.reverse().toString());
    }
}