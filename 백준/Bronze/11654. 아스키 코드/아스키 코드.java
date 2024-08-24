
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ASCII=br.read();

        if (ASCII>=48 && ASCII<=57){
            System.out.println(ASCII);
        } else if (ASCII>=65 && ASCII<=90){
            System.out.println(ASCII);
        } else if (ASCII>=97 && ASCII<=122) {
            System.out.println(ASCII);
        } else {

        }

        br.close();
    }
}