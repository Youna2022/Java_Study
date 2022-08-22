package Study02;

public class CollatzConjec {
//	1-1. 입력된 수가 짝수라면 2로 나눕니다. 
//	1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
//	2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 
	 public static int solution(int num) {
	        int answer = 0;
	        long n = (long) num;
	        while(n != 1) {
	        	answer++;
	        	n = n%2 == 0 ? n/2 : n*3+1;
	        	if(answer == 500) {
	        		answer = -1;
	        		break;
	        	}
	        } 
	        return answer;
	    }
	 
	public static void main(String[] args) {
		int num = 626331;
		System.out.println(solution(num));
		
		
	}

}

//n	result
//6	8
//16	4
//626331	-1