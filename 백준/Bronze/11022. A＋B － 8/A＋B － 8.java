import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PrintWriter pw = new PrintWriter(bw);

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st;

        while(true){
            if (n == count){
                break;
            } else {
                count++;
                st = new StringTokenizer(br.readLine(), " ");
                pw.printf("Case #%d: ", count);
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int result = A + B;
                pw.printf("%d + %d = %d\n", A, B, result);
            }
        }
        br.close();
        pw.flush();
        pw.close();
    }
}


