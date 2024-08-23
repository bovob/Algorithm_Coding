import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(bw, true);

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n ; i++){
            for (int j = 0 ; j < n - i ; j++){
                pw.print(" ");
            }
            for (int k = 0; k < i ; k++){
                pw.print("*");
            }
            pw.println();
        }
        
        br.close();
    }
}