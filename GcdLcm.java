package Study02;

import java.util.Arrays;

//두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수,
//solution을 완성해 보세요. 배열의 맨 앞에 최대공약수,
//그다음 최소공배수를 넣어 반환하면 됩니다.
//예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로
//solution(3, 12)는 [3, 12]를 반환해야 합니다.
public class GcdLcm {
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];

		int min = (n < m) ? n : m;
		int gcd = 0;

		for (int i = 1; i <= min; i++) {
			if (n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}

		min = n * m / gcd;
		answer[0] = gcd;
		answer[1] = min;
		return answer;
	}

	public static void main(String[] args) {
		int n = 3;
		int m = 12;

		int[] ans = solution(n, m);
		System.out.println(Arrays.toString(ans));// [1,10]
	}

}
