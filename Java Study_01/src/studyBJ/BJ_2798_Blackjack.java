package studyBJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_2798_Blackjack {

	/*
	 * 블랙잭 
	 * 
	 * 문제	:	카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 
	 * 			카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 
	 * 			블랙잭은 카지노마다 다양한 규정이 있다.
	 *			한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
	 * 			김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 
	 * 			그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 
	 * 			그런 후에 딜러는 숫자 M을 크게 외친다.
	 * 			이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 
	 * 			블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
	 * 			N장의 카드에 써져 있는 숫자가 주어졌을 때, 
	 * 			M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
	 * 
	 * 입력	:	첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 
	 * 			둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
				합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
	 * 
	 * 출력	:	첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
	 * 
	 * 테스트 :	5 21					>>		21
				5 6 7 8 9
	 *  
	 *  풀이	:	숫자 3개 조합을 구하기.
	 *  		for문을 3번 돌려 조합을 만들고 같으면 바로 출력,
	 *  		다르면 sum에 배열의 합을 넣고 비교, sum보다 크고 m보다 작을경우 sum = temp
	 *  		
	 *  결과 :	14112	128ms
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] arr = new int [n];
		int sum = 0;
		int temp = 0;	// 비교할 변수 
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n-2; i++) {				// 끝 2개를 남기고 비교. 
			for(int j = i+1; j < n-1; j++) {		// 끝 1개를 남기고 비교. 
				for(int k = j+1; k < n; k++) {		
					temp = arr[i] + arr[j] + arr[k];	// 5, 6, 7 -> 18 != 21
					if(temp == m) {
						bw.write(String.valueOf(temp));
						bw.flush();
						bw.close();
						return;
					}
					if(temp > sum && temp < m) {	// sum = 18;  5, 6, 8 / 5, 6, 9  // 5, 7, 8 / 5, 7, 9 / 5, 8, 9 
						sum = temp;
					}
				}
			}
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		
	}

}
