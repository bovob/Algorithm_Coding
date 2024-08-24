
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
     
        int tryNum = 0;

        StringBuilder sb = new StringBuilder();

        while (true) {
            if (num == tryNum){
                break;
            } else {
                String[] str= br.readLine().split("");

                if(str.length == 1){
                    sb.append(str[0]).append(str[0]).append("\n");
                    tryNum++;
                } else {
                    sb.append(str[0]).append(str[str.length-1]).append("\n");
                    tryNum++;
                }
            }
        }

        System.out.println(sb);
    }
}