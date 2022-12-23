import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 1000 - Integer.parseInt(br.readLine());
		int count = 0;
		int[] arr = {500,100,50,10,5,1};
		for(int i =0; i<arr.length; i++) {
			if(N%arr[i]>=0) {
				count += N/arr[i];
				N = N%arr[i];
			}	
		}
		System.out.println(count);
	}
}