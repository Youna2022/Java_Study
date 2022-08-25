package Study02;

public class PlusNum {

	public static int solution(int n) {
		int answer = 0;
		String[] num = String.valueOf(n).split("");
		for (String arr : num) {
			answer += Integer.parseInt(arr);
		}
		return answer;
	}

	public static void main(String[] args) {
		int N = 987;
		System.out.println(solution(N));
	}

}

//N	answer
//123	6
//987	24