package Study02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoNumSolution {

	public static int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (!list.contains(numbers[i] + numbers[j])) {
					list.add(numbers[i] + numbers[j]);
				}
			}
		}
		Collections.sort(list);

		int[] answer = list.stream().mapToInt(i -> i).toArray();
		return answer;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4, 1 };
		int[] ans = solution(arr);

		System.out.println(Arrays.toString(ans));

	}

}
