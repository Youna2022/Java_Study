package Study02;

public class IntSqrt {
	public static long solution(long n) {
		long sqrt = (long) Math.sqrt(n);
		return Math.pow(sqrt, 2) == n ? (long) Math.pow(sqrt + 1, 2) : -1;

//        long answer = 0;
//        return answer;
	}

	public static void main(String[] args) {
		long n = 19;
		System.out.println(solution(n));

	}

}

//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//n  	return
//121	144
//3	    -1