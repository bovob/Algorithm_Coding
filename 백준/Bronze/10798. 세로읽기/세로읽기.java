import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Character[][] strArray = new Character[5][15];

        for (int i = 0; i < 5; i++) {
            String line = scan.nextLine();

            for (int j = 0; j < line.length(); j++) {
                strArray[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(strArray[j][i] != null){
                    System.out.print(strArray[j][i]);
                }
            }
        }
    }
}