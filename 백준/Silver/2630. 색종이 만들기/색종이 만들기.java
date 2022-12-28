import java.io.*;
import java.util.*;

public class Main {

    public static int[][] BOARD;
    public static int WHITE;
    public static int BLUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BOARD = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                BOARD[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        System.out.println(WHITE);
        System.out.println(BLUE);
    }

    public static void partition(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if (BOARD[row][col] == 0) {
                WHITE++;
            } else {
                BLUE++;
            }
            return;
        }
        int newSize = size / 2;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
    }

    public static boolean colorCheck(int row, int col, int size) {
        int color = BOARD[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != BOARD[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}