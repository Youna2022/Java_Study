package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ24264_Algorithm_RunTime3 {

//	알고리즘 : n*n 출력 / 2출력 (n의 제곱)
//	MenOfPassion(A[], n) {
//	    sum <- 0;
//	    for i <- 1 to n
//	        for j <- 1 to n
//	            sum <- sum + A[i] × A[j]; # 코드1
//	    return sum;
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println((long)Math.pow(n, 2) + "\n" + 2);
		
	}
}
