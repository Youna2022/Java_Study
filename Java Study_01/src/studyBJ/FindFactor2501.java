package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindFactor2501 {

//	약수 구하기 _ 2501
//	
//	입력   >> 6 3
//	첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다. N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.
//
//	출력 >> 3
//	첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 
//	만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	// 6 3
		int n = Integer.parseInt(st.nextToken());					// 6
		int k = Integer.parseInt(st.nextToken());					// 3
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {		// 1			2	3	
			if(n % i == 0) {				// 6 % 1 == 0 	
				cnt++;						// cnt = 1		2	3
				if(cnt == k) {				// 3번째로 작을때 
					System.out.println(i);	// i = 3
				}
			}
		}
		if(cnt < k) {	//	cnt(약수의 개수) 가 k보다 작을떄 -> 0 
			System.out.println(0);
		}
	}

}
