import java.util.Scanner;

public class CookTime {
//	첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와
//	분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
//	두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
//  14 30
//  50
	public static void main(String[] args) {
		int h = 0;
		int m = 0;
		int time = 0;

		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();
		time = sc.nextInt();

		int tmp = 60 * h + m + time;
		h = tmp / 60;
		m = tmp % 60;
		if (h >= 24) {
			h -= 24;
		}
		System.out.println(h + " " + m);
	}
}
