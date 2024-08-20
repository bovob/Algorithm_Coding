import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        List<String> strList = new ArrayList<>(List.of(str.split("")));

        Collections.reverse(strList);

        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();

        for (int i = 0 ; i < 3 ; i++) {
            sbA.append(strList.get(i));
        }

        for (int i = 4 ; i < 7 ; i++) {
            sbB.append(strList.get(i));
        }

        int a = Integer.parseInt(String.valueOf(sbA));
        int b = Integer.parseInt(String.valueOf(sbB));


        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        br.close();
    }
}