
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        String[] strArr = str.split("");

        int result = 0;

        for (int i = 0 ; i < str.length() ; i++){

            int tmp = strArr[i].charAt(0);
            result+=2;
            switch (tmp){
                case 65,66,67: result+=1; break;
                case 68,69,70: result+=2; break;
                case 71,72,73: result+=3; break;
                case 74,75,76: result+=4; break;
                case 77,78,79: result+=5; break;
                case 80,81,82,83: result+=6; break;
                case 84,85,86: result+=7; break;
                case 87,88,89,90: result+=8; break;
                default: break;
            }
        }
        System.out.println(result);
        br.close();
    }
}