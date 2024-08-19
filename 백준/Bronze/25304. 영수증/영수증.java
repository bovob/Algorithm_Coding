import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPrice = Integer.parseInt(scan.nextLine());
        int totalNumber = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int tryNum = 0;

        while (true) {
            int price = 0;
            int number = 0;

            if (tryNum==totalNumber){
                break;
            } else {
                price = scan.nextInt();
                number = scan.nextInt();
                sum += price * number;
                tryNum++;
            }
        }

        if(totalPrice == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}
