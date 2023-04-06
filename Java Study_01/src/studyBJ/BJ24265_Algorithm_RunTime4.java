package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ24265_Algorithm_RunTime4 {

//	알고리즘 : n*(n-1)/2	 출력 / 2출력 (n의 제곱)
//	MenOfPassion(A[], n) {
//	    sum <- 0;
//	    for i <- 1 to n - 1
//	        for j <- i + 1 to n
//	            sum <- sum + A[i] × A[j]; # 코드1
//	    return sum;
//	}	 

	/*
	 * 입력	:	첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
	 * 
	 * 출력	:	첫째 줄에 코드1 의 수행 횟수를 출력한다.
	 * 			둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 
	 * 			단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
	 * 
	 * 풀이	:	등차수열 합 공식은 n*(n-1)/2		 
	 * a1 + a2 + ··· + an = 1/2 X 항의 수 X (첫항 + 끝항) = 1/2 X n X (a1 + an)    
	 */	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(n*(n-1)/2);
		System.out.println(2);
		
	}
}
