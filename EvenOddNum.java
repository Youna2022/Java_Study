package Study02;

public class EvenOddNum {

	public String solution(int num) {
		String answer = "";
		if(num%2 == 0) {
			answer = "Even";
		}else {
			answer ="Odd";     
		}
		return answer;
	}
}
