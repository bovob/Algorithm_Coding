
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

        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num ; i++) {
            for(int j = 0; j < num-i; j++)
                pw.print(" ");
            for(int j = 0; j < i*2-1; j++)
                pw.print("*");
            pw.println();
        }

        for(int i = num-1; i >= 0 ; i--) {
            for(int j = 0; j < num-i; j++)
                pw.print(" ");
            for(int j = 0; j < i*2-1; j++)
                pw.print("*");
            pw.println();
        }
        pw.flush();
        pw.close();
        br.close();
    }
}