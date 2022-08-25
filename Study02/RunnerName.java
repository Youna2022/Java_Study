package Study02;

import java.util.HashMap;

public class RunnerName {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> runner = new HashMap<>();
		for (String p : participant) {
			runner.put(p, runner.getOrDefault(p, 0) + 1);
		}
		for (String c : completion) {
			runner.put(c, runner.get(c)-1);
		}
		for (String name : runner.keySet()) {
			if (runner.get(name) != 0) {
				answer = name;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] pcnt = { "leo", "kiki", "eden" };
		String[] cmp = { "eden", "kiki" };
		System.out.println(solution(pcnt, cmp));

	}

}
