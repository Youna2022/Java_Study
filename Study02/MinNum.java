package Study02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinNum {
	public static int[] solution(int[] arr) {
		List<Integer> num = new ArrayList<>();

		if (arr.length == 1) {
			int[] answer = { -1 };
			return answer;
		}

		for (int i = 0; i < arr.length; i++) {
			num.add(arr[i]);
		}
		num.remove(num.indexOf(Collections.min(num)));

		int[] answer = num.stream().mapToInt(i -> i).toArray();
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		int[] ans = solution(arr);

		System.out.println(Arrays.toString(ans));
	}

}
