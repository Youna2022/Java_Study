package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1436_DirectorShun {

	/*
	 * 영화감독 숀 
	 * 문제	:	666은 종말을 나타내는 수라고 한다. 따라서, 많은 블록버스터 영화에서는 666이 들어간 제목을 많이 사용한다.
	 * 			영화감독 숌은 세상의 종말 이라는 시리즈 영화의 감독이다. 
	 * 			조지 루카스는 스타워즈를 만들 때, 스타워즈 1, 스타워즈 2, 스타워즈 3,스타워즈 4, 스타워즈 5, 
	 * 			스타워즈 6과 같이 이름을 지었고, 피터 잭슨은 반지의 제왕을 만들 때, 
	 * 			반지의 제왕 1, 반지의 제왕 2,반지의 제왕 3과 같이 영화 제목을 지었다. 
	 * 			하지만 숌은 자신이 조지 루카스와 피터 잭슨을 뛰어넘는다는 것을 보여주기 위해서 영화 제목을 좀 다르게 만들기로 했다.
	 * 
	 * 			종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수를 말한다. 
	 * 			제일 작은 종말의 수는 666이고, 그 다음으로 큰 수는
	 * 			1666, 2666, 3666, .... 이다. 따라서, 숌은 첫 번째 영화의 제목은 "세상의 종말 666", 
	 * 			두 번째 영화의 제목은 "세상의 종말 1666"와 같이 이름을 지을 것이다. 
	 * 			일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 수)와 같다.
	 * 
	 * 			숌이 만든 N번째 영화의 제목에 들어간 수를 출력하는 프로그램을 작성하시오.
				숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.
	 * 
	 * 입력	:	첫째 줄에 N이 주어진다. N은 10,000보다 작거나 같은 자연수이다.
	 * 
	 * 출력	:	첫째 줄에 N번째 영화의 제목에 들어간 수를 출력한다.
	 * 
	 * 요약	:	666이 들어가는 수 중 N번째 작은 수 구하기.
	 * 
	 * 풀이	:	while문을 사용해서 계속 돌림.
	 * 			contains함수를 이용해서 666이 있으면 cnt ++ 	--> num=666 cnt = 1;
	 * 			n과 cnt가 같으면 break
	 * 
	 * 생각	:	성능이 너무 안좋다. 다른 방법을 찾아야 곘다. (이해는 가는데 코드로 못짜겠다.)
	 * 
	 * 제출	:	86052	300 ms
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 666;
		int cnt = 0;
		
		while(true) {
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
			if(n == cnt) {
				break;
			}
			num++;

		}
		System.out.println(num);
	}

}
