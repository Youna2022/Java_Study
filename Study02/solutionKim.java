package Study02;

import java.util.Arrays;
import java.util.List;

public class solutionKim {
	public static void main(String[] args) {
		String[] name = {"Jane", "Kim"};
		String ans = solution(name);
		System.out.println(ans);
	}

	public static String solution(String[] seoul) {
		List<String> list = Arrays.asList(seoul);
		int a = list.indexOf("Kim");

		String answer = String.format("김서방은 %d에 있다", a);
		return answer;
	}
}
