import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = n / 4;

        StringBuilder str = new StringBuilder();

        for (int i = 0 ; i < result ; i++){
            str.append("long ");
        }
        str.append("int");

        System.out.println(str);
    }
}


