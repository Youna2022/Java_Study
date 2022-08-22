package Study02;

public class HarshadNum {

	public static boolean solution(int x) {
		int sum = 0;
		int a = x;

		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}
		return x % sum == 0 ? true : false;
	}

	public static void main(String[] args) {
		int arr = 50;
		System.out.println(solution(arr));

	}

}
//arr	return
//10	true
//12	true
//11	false
//13	false