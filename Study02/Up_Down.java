package Study02;

import java.util.Scanner;

//��ǻ�Ͱ� 1~100 ����(���� ����) �� �ϳ��� �������� ���մϴ�. (�̸� �˷����� �ʽ��ϴ�.)
//����ڴ� �� ���ڸ� ���߾�� �մϴ�.
//�Է��� ���ں��� ������ ũ�� �� "UP" ���,
//�Է��� ���ں��� ������ ������ �� "DOWN" ���.
//������ ���߸� �� "����"�� ����ϰ�, ���ݱ��� ���ڸ� �Է��� Ƚ���� �˷��ݴϴ�.

public class Up_Down {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		
		int cnt = 0;
		int com = (int) (Math.random() * 100) + 1;

		while (true) {
			int tmp = sc.nextInt();
			cnt++;
			
			if (tmp > com) {
				System.out.println("UP");
			} else if (tmp < com) {
				System.out.println("DOWN");
			} else {
				System.out.printf("����! �Է��� Ƚ���� : %d", cnt);
				break;
			}
		} 
	}
}
