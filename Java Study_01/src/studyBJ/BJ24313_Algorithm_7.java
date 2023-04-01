package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ24313_Algorithm_7 {

	/*
	 * 문제	:	오늘도 서준이는 점근적 표기 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
	 * 			알고리즘의 소요 시간을 나타내는 O-표기법(빅-오)을 다음과 같이 정의하자.
	 * 			O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}
	 * 			이 정의는 실제 O-표기법(https://en.wikipedia.org/wiki/Big_O_notation)과 다를 수 있다.
	 * 			 함수 f(n) = a1n + a0, 양의 정수 c, n0가 주어질 경우 O(n) 정의를 만족하는지 알아보자.
	 * 
	 * 입력	:	첫째 줄에 함수 f(n)을 나타내는 정수 a1, a0가 주어진다. (0 ≤ |ai| ≤ 100)
	 * 			다음 줄에 양의 정수 c가 주어진다. (1 ≤ c ≤ 100)
	 * 			 다음 줄에 양의 정수 n0가 주어진다. (1 ≤ n0 ≤ 100)
	 * 
	 * 출력	:	f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력한다.
	 * 
	 * 풀이1	:	수학으로 풀이 후  + 변수를 만들어 하나씩 대입했다.
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c  = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int fn = (a1 * n) + a0;
		
		//	1. 거짓인 조건 판단:	14268	128ms 
		//	a0 <= n * (c-a1) 	-->c-a1 가 음수면 부등호가 바뀐다.
		//	c - a1 < 0	일때 조건.
//		int answer = 1;
//		if(fn > c * n || c < a1) {	// && || 주의! 예)!(a && b) --> !a || !b
//			
//			answer = 0;
//		}
		
//		2. 참인 조건	:	14176	120ms  --> 거짓 조건보다 조금 더 빠르다.
		int answer = 0;
		if(fn <= c * n && c >= a1) {
			answer = 1;
		}
		System.out.println(answer);
	}
}
