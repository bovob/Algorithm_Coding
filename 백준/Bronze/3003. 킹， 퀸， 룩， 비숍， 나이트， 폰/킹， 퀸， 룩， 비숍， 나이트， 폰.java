import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // King, Queen, Rook, Bishop, Knight, Pawn
        final int[] CHESS = {1, 1, 2, 2, 2, 8};
        String inven = br.readLine();
        String[] strInven = inven.split(" ");
        int[] invenChess = new int[6];

        for (int i = 0; i < invenChess.length ; i++ ){
            invenChess[i] = Integer.parseInt(String.valueOf(strInven[i]));
        }

        for (int i = 0; i < invenChess.length ; i++){
            int num;
            num = CHESS[i] - invenChess[i];
            System.out.printf("%d ", num);
        }

        br.close();
    }
}