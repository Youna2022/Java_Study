package Study02;

//1���� 10������ � ���ε� ������ �������� ���� ���� ���� 2520�Դϴ�.
//�׷��ٸ� 1���� 20������ � ���ε� ������ �������� ���� ���� ���� ���Դϱ�?

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
