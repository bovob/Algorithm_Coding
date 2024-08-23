import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> score = new ArrayList<>();

        for (int i = 0 ; i < N ; i++){
            int tmp = scan.nextInt();
            score.add(tmp);
        }

        double MAX = Collections.max(score);
        double avg = 0;

        for (int i = 0 ; i < score.size() ; i++){
            avg += score.get(i);
        }

        avg = ((avg/(double)N)*100)/MAX;
        System.out.printf("%.2f", avg);
    }
}