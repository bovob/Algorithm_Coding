
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =  new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] sprout = {
            "         ,r'\"7 ",
            "r`-_   ,'  ,/ ",
            " \\. \". L_r' ",
            "   `~\\/ ",
            "      | ",
            "      | "
        };

        for (String s : sprout){
            pw.println(s);
        }
        pw.flush();
        pw.close();
        br.close();
    }
}




