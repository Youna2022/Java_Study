package Study02;

import java.util.Scanner;

//컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
//사용자는 이 숫자를 맞추어야 합니다.
//입력한 숫자보다 정답이 크면 → "UP" 출력,
//입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
//정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.

public class Up_Down {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		
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
				System.out.printf("정답! 입력한 횟수는 : %d", cnt);
				break;
			}
		} 
	}
}
