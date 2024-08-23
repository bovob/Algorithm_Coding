import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] boxArr = new int[N];

        for (int i = 0 ; i < boxArr.length ; i++){
            boxArr[i] = i+1;
        }

        for (int i = 0 ; i < M ; i++){
            int chNum = 0;
            int tmp = 0;
            int a = scan.nextInt();
            int b = scan.nextInt();

           if (b > a){
               chNum = b-a;
               for (int j = a ; j < a+chNum ; j++){
                   tmp = boxArr[j-1];
                   boxArr[j-1] = boxArr[a+chNum-1];
                   boxArr[a+chNum-1] = tmp;
                   chNum--;
               }
           } else if (a > b){
               chNum = a-b;
               for (int j = b ; j < b+chNum ; j++){
                   tmp = boxArr[j-1];
                   boxArr[j-1] = boxArr[b+chNum-1];
                   boxArr[b+chNum-1] = tmp;
                   chNum--;
               }
           } else {
               continue;
           }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < boxArr.length ; i++){
            sb.append(boxArr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
