import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0 ;
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check(){
        boolean[] alphabet = new boolean[26];
        int prev = 0;
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);

            if (prev != index){
                if (alphabet[index - 'a'] == false){
                    alphabet[index - 'a'] = true;
                    prev = index;
                } else {
                    return false;
                }
            } 
        }
        return true;
    }
}