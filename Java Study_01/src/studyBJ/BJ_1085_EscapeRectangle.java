package studyBJ;

import java.util.Scanner;

public class BJ_1085_EscapeRectangle {

//	직사각형에서 탈출
//	문제	:	한수는 지금 (x, y)에 있다. 
//			직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0),
//			오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//
//	입력	:	첫째 줄에 x, y, w, h가 주어진다.		예 >> 653 375 1000 1000
//
//	출력	:	첫째 줄에 문제의 정답을 출력한다.		출력 >> 347 
//
//	제한	:	1 ≤ w, h ≤ 1,000
//			1 ≤ x ≤ w-1
//			1 ≤ y ≤ h-1
//			x, y, w, h는 정수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int minX = Math.min(w-x, x);
		int minY = Math.min(h-y, y);
		
		System.out.println(Math.min(minX, minY) + "");
	}

}
