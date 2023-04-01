package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14215_ThreeBars {

	/*
	 * 세 막대 
	 * 문제	:	영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
	 * 			영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
	 * 			각 막대의 길이는 양의 정수이다 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다. 
	 * 			삼각형의 둘레를 최대로 해야 한다. 
	 * 			a,b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오.
	 * 
	 * 입력	:	첫째 줄에 a, b, c (1 ≤ a, b, c ≤ 100)가 주어진다.
	 * 
	 * 출력	:	첫째 줄에 만들 수 있는 가장 큰 삼각형의 둘레를 출력한다.
	 * 
	 * 예	:	1 2 3	/	5
	 * 
	 * 풀이 과점:	1. 정사각형, 직사각 : 둘레는 a+b+c		--> sum
	 * 			2. 올바르지 않은 삼각형 : 
	 * 			   a b c 중 최대값(max) 	sum-max <= max 일 경우   (나머지 두변의 합 <= 큰변)
	 * 			   올바른 삼각형이 되기 위해 max(큰변 ) = sum - max-1 가 된다.
	 * 			   둘레 = sum - max + (sum - max-1)  --> 2*(sum-max) - 1
	 * 			   
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int maxNum = 0;
		int sum = a + b + c;
		maxNum += Math.max(Math.max(a, b), Math.max(a, c));
		
		
		if(2*maxNum < sum) {
			System.out.println(sum);
		} else {
			System.out.println(2*(sum-maxNum)-1);
		}
		
		
	}

}
