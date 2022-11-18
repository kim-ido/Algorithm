import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        System.out.print((a>=90)?"A":(a>=80)?"B":(a>=70)?"C":(a>=60)?"D":"F");
    }
}
