import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0 ; i < N ; i++){
            int tmp = scan.nextInt();
            numbers.add(tmp);
        }

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.printf("%d %d", min, max);
    }
}