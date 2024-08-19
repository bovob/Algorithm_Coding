import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] student = new int[31];

        for (int i = 0; i < 28 ; i++){
            int submit = Integer.parseInt(br.readLine());
            student[submit] = 1;
        }

        for (int i = 1; i < student.length ; i++){
            if(student[i] != 1){
                System.out.println(i);
            }
        }

        br.close();
    }
}