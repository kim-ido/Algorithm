import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            System.out.println("Case #" + i + ": "
                + (Integer.parseInt(st.nextToken())
                + Integer.parseInt(st.nextToken())));
        }
        br.close();
    }
}