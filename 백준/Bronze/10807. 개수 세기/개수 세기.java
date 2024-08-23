import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        int num = scan.nextInt();

        for (int i = 0 ; i < num ; i++){
            int tmp = scan.nextInt();
            numList.add(tmp);
        }

        int correctNum = scan.nextInt();
        int result = 0;

        for (int i = 0 ; i < numList.size() ; i++){
            if(numList.get(i).equals(correctNum)){
                result += 1;
            }
        }

        System.out.println(result);
    }
}