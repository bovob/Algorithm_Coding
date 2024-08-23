import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[9];
        int max = 0;
        int result = 0;

        for (int i = 0 ; i < 9 ; i++){
            int input = scan.nextInt();
            numbers[i] = input;

            if (max == 0){
                max = input;
            } else if (input > max) {
                result = i;
                max = input;
            } else {
                continue;
            }
        }
        System.out.printf("%d\n%d", max, result+1);
    }
}