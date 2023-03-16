package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindPrimeNum {

	/*
	 * 소수찾기 1978
	 * 
	 * 문제  : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	 * 
	 * 입력  : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
	 * 
	 * 출력  : 주어진 수들 중 소수의 개수를 출력한다.
	 */
	
	private static boolean [] prime = new boolean[1001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String [] arr = br.readLine().split(" ");
		
		pNum();
		
		for(int i = 0; i < arr.length; i++) {
			if(prime[Integer.parseInt(arr[i])]) {
				cnt--;
			}
		}
		System.out.println(cnt);
		
	}
	
	//에라토스테네스의 체
	private static void pNum() {
		prime [0] = true;
		prime [1] = true;
		
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			if(!prime[i]) {
				for(int j = i*i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
	}

}
