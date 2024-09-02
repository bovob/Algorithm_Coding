import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        int[] strArr = new int[str.length()];
        int[] intArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int tmp = str.charAt(i);
            strArr[i] = tmp;
        }

        for (int i = 0; i < str.length(); i++) {
            int tmp = strArr[i] - 65;
            intArr[tmp] += 1;
        }

        int result = -1;
        char ch = '?';

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > result) {
                result = intArr[i];
                ch = (char) (i + 65);
            } else if (intArr[i] == result) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
