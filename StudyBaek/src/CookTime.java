import java.util.Scanner;

public class CookTime {
//	ù° �ٿ��� ���� �ð��� ���´�. ���� �ð��� �� A (0 �� A �� 23) ��
//	�� B (0 �� B �� 59)�� ������ ��ĭ�� ���̿� �ΰ� ������� �־�����.
//	�� ��° �ٿ��� �丮�ϴ� �� �ʿ��� �ð� C (0 �� C �� 1,000)�� �� ������ �־�����. 
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
