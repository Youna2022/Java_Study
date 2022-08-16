package Study02;

class SolutionWatermelon {
	public static void main(String[] args) {
		int num = 8;
		
		String msg = solution(num);
		System.out.println(msg);
	}
	
	public static String solution (int n) {

		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "¼ö";
			} else {
				answer += "¹Ú";
			}
		}
		return answer;
	}
}