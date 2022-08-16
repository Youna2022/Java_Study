package Study02;

import java.util.Stack;

public class NoNumber {
	public static Stack<Integer> solution(int[] arr) {

		Stack<Integer> answer = new Stack<>();

		answer.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				answer.push(arr[i]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] num = { 1, 1, 3, 3, 0, 1, 1 };

		Stack<Integer> ans = solution(num);

		System.out.println(ans);
	}
}
