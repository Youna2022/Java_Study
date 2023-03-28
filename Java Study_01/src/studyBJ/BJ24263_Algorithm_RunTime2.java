package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ24263_Algorithm_RunTime2 {

//	알고리즘 : n 출력 / 1 출력 
//	MenOfPassion(A[], n) {
//	    sum <- 0;
//	    for i <- 1 to n
//	        sum <- sum + A[i]; # 코드1
//	    return sum;
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine()).append("\n").append(1);
		
		System.out.println(sb);
	}

}
