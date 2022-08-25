package Study02;

import java.util.Arrays;
import java.util.Collections;

public class IntSort {

	public static long solution(long n) {
		long answer = 0;
		String str = Long.toString(n);
		String[] array = str.split("");
		Arrays.sort(array, Collections.reverseOrder());
		String numlist = "";
		for (int i = 0; i < array.length; i++) {
			numlist += array[i];
		}
		answer = Long.parseLong(numlist);
		return answer;
	}

	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
}

//return = 873211