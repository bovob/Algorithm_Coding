
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(br.readLine());
        int result = 0;

        if(index >= 0){
            String input = br.readLine();

            int numIndex = Math.min(index, 100);

            for (int i = 0; i < numIndex ; i++){
                result += Character.getNumericValue(input.charAt(i));
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}