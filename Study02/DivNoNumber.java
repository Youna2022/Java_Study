package Study02;

//1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?

public class DivNoNumber {

	public static void main(String[] args) {
		int cnt = 0;
		int rs = 0;

		while (true) {
			cnt++;
			rs = 0;
			for (int i = 1; i < 21; i++) {
				if (cnt % i == 0) {
					rs++;
				}
			}
			if (rs == 20) {
				break;
			}
		} 
		System.out.println(cnt);
	}
}
