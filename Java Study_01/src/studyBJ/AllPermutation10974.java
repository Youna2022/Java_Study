package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllPermutation10974 {

//	모든 순열 _ 10974
//	문제
//	N이 주어졌을 때, 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오.
//
//	입력   >> 3
//	첫째 줄에 N(1 ≤ N ≤ 8)이 주어진다. 
//
//	출력
//	첫째 줄부터 N!개의 줄에 걸쳐서 모든 순열을 사전순으로 출력한다.
	
	private static int num;
	private static int [] arr;
	private static boolean [] visited;
	private static final StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		arr = new int [num];
		visited = new boolean[num];
		dfs(0);
		System.out.print(sb);
		
	}

	private static void dfs(int cnt) {
		if(cnt == num) { // 0 3  -> 3 3
			for(int i = 0; i < num; i++) {
//				System.out.print(arr[i] + " -");
				sb.append(arr[i]).append(" ");
			}
//			System.out.println();
			sb.append("\n");
			return;
		}	
//				for 안에서 dfs 호출 	cnt=1 ,i=0 --> visted[i] = false 까지 간다. 			cnt=2; 
//					visted[0]=true;  - > for문 안탐. ---> i=1									!visted[2]
		for(int i = 0; i < num; i++) { // 0							
			if(!visited[i]) { 			//false		
				arr[cnt] = i + 1;		// arr [0] = 1;				arr[1] = 2;				arr[2] = 3;
				visited[i] = true;		// visited[0] = true;		visited[1] =true; 		visted[2] = true;
				dfs(cnt + 1);			// dfs(1);					dfs(2)					dfs(3);  ---->>    cnt== num 으로간
				visited[i] = false;		// 다시위로 
			}
			
		}
		
	}
}
