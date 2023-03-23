package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM15649 {

//	문제
//	자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//
//	1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
//	입력
//	첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
//
//	출력
//	한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
//
//	수열은 사전 순으로 증가하는 순서로 출력해야 한다.
//
//	예제 입력 1 
//	3 1
	
	private static int N;		// 3
	private static int M;		// 1
	private static boolean [] visit;
	private static int [] arr;
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int [N];
		
		visit = new boolean[N];
		dfs(0);
		System.out.println(sb);
		
	}

	private static void dfs(int cnt) {
		if(M == cnt) {
			for(int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				arr[cnt] = i + 1;
				visit[i] = true;
				
				dfs(cnt + 1);
				visit[i] = false;
			}
		}
		
	}
	
}
