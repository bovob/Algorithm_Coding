import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scan.nextInt();
        int count = 1; 
        int range = 2;	

        if (N == 1) {
            System.out.print(1);
        }

        else {
            while (range <= N) {	
                range = range + (6 * count);
                count++;	
            }
            System.out.print(count);
        }
    }
}