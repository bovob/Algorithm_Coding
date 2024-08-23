import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();

        int[] boxArr = new int[M];

        for (int i = 1 ; i <= boxArr.length ; i++){
            boxArr[i-1] = i;
        }

        for (int i = 0; i < N ; i++) {
            int I = scan.nextInt() - 1;
            int J = scan.nextInt() - 1;

            int tmp = 0;
            tmp = boxArr[I];
            boxArr[I] = boxArr[J];
            boxArr[J] = tmp;
        }

        for (int numbers : boxArr){
            System.out.printf("%d ",numbers);
        }
    }
}
