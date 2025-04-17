import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

      int num = scan.nextInt();
      scan.nextLine();
      int sum = 0;

      int[][] map = new int[100][100];

          for (int i = 0 ; i < num ; i++) {

              String xy = scan.nextLine();
              String[] xyParts = xy.split(" ");

              int x = Integer.parseInt(xyParts[0]);
              int y = Integer.parseInt(xyParts[1]);

              for (int j = x ; j < x+10 ; j++) {
                  int mapX = j;
                  for (int k = y ; k < y+10 ; k++) {
                      int mapY = k;

                      if (map[mapX][mapY] == 0) {
                          map[mapX][mapY] = 1;
                      }
                  }
              }
          }
      for (int i = 0 ; i < 100 ; i++){
          for (int j = 0 ; j < 100 ; j++) {
              sum += map[i][j];
          }
      }
      System.out.println(sum);
    }
}