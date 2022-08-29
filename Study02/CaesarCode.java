package Study02;

public class CaesarCode {
//	"z"	1	"a"
//	"a B z"	4	"e F d
	public static String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char arr = s.charAt(i);
			if (arr >= 'a' && arr <= 'z') {
				if (arr + n > 'z') {
					answer += (char) (arr + n - 26);
				} else {
					answer += (char) (arr + n);
				}
			} else if (arr >= 'A' && arr <= 'z') {
				if (arr + n > 'Z') {
					answer += (char) (arr + n - 26);
				} else {
					answer += (char) (arr + n);
				}
			} else {
				answer += " ";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		System.out.println(solution(s, n));

	}

}
