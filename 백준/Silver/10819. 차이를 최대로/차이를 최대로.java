import java.io.*;
import java.util.*;

public class Main {

    public static int n;
    public static int answer = 0;
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visit = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 0);
        System.out.println(answer);
    }

    public static void dfs(int cnt, int bf, int sum) {
        if (cnt == n) {
            answer = Math.max(answer, sum);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visit[i]) {
                continue;
            }
            visit[i] = true;
            dfs(cnt + 1, arr[i], cnt == 0 ? 0 : sum + Math.abs(bf - arr[i]));
            visit[i] = false;
        }
    }
}