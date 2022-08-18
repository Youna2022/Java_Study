package Study02;

public class NumString {
	public static int solution(String s) {
//        int answer = 0;

		String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < words.length; i++) {
			s = s.replace(words[i], String.valueOf(i));
		}
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		String words = "23four5six7";
		int abc = solution(words);
		System.out.println(abc);
	}

}
//one4seveneight"
//234567 ¡æ "23four5six7"
//10203 ¡æ "1zerotwozero3"