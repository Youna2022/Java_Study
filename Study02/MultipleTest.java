package Study02;

//10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
//1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.

public class MultipleTest {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
