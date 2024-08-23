import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int X = scan.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0 ; i < N ; i++) {
            int tmp = scan.nextInt();
            if(X > tmp){
                sb.append(tmp).append(" ");
            }
        }

        System.out.println(sb);
    }
}