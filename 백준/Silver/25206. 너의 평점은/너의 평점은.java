import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        float totalScore = 0f;
        float totalCredit = 0f;

        for (int i = 0; i < 20; i++) {
            String line = scan.nextLine();
            String[] grade = line.split(" ");
            float credit = Float.parseFloat(grade[1]);
            String score = grade[2];

            switch (score) {
                case "A+": totalScore += credit * 4.5f; totalCredit += credit; break;
                case "A0": totalScore += credit * 4.0f; totalCredit += credit; break;
                case "B+": totalScore += credit * 3.5f; totalCredit += credit; break;
                case "B0": totalScore += credit * 3.0f; totalCredit += credit; break;
                case "C+": totalScore += credit * 2.5f; totalCredit += credit; break;
                case "C0": totalScore += credit * 2.0f; totalCredit += credit; break;
                case "D+": totalScore += credit * 1.5f; totalCredit += credit; break;
                case "D0": totalScore += credit * 1.0f; totalCredit += credit; break;
                case "F" : totalScore += credit * 0.0f; totalCredit += credit; break;
                case "P" : /* pass 과목은 제외 */ break;
            }
        }

        String result = String.format("%.6f", totalScore / totalCredit);  
        System.out.println(result); 
    }
}