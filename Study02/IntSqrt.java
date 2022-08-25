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

//������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
//n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
//n  	return
//121	144
//3	    -1