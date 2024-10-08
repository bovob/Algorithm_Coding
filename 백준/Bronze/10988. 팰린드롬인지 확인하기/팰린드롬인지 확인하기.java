
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        int result = 1;

        for (int i=0 ; i < str.length()/2 ; i++){
            if (str.charAt(i) != sb.charAt(i)) {
                result = 0;
                break;
            }
        }
        System.out.println(result);

        br.close();
    }
}