import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alarm {
//	 (0 �� H �� 23, 0 �� M �� 59) 
//	10 10 - 45��
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());


		if (m >= 45) {
			m -= 45;
		} else {
			if (h == 0) {
				h = 23;
			} else {
				h -= 1;
			}
			m += 15;
		}
		System.out.println(h + " " + m);
	}

}
