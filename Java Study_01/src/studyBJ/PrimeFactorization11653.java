package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactorization11653 {

//	소인수분해
	
//	문제
//	정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
//
//	입력 >> 72  9991
//	첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
//
//	출력
//	N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 72
		
		for(int i = 2; i <= Math.sqrt(num); i++) { // 2
			while(num % i == 0) {
				System.out.println(i); //2
				num /= i; // 36 18  9 
			}
		}
		if(num != 1) {
			System.out.println(num);
		}
	}
	
}
