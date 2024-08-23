import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        //int[] boxArr = new int[10];

        int[] resultArr = new int[42];
        for (int i = 0 ; i < resultArr.length ; i++){
            resultArr[i] = 0;
        }

        for (int i = 0; i < 10 ; i++) {
            int I = scan.nextInt();
            //boxArr[i] = I%42;
            resultArr[I%42] = 1;
        }

        int result = 0;

        for (int i = 0; i <resultArr.length ; i++){
            if (resultArr[i] == 1 ){
                result += 1;
            }
        }

        System.out.println(result);
    }
}
