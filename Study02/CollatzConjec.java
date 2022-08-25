package Study02;

public class CollatzConjec {
//	1-1. �Էµ� ���� ¦����� 2�� �����ϴ�. 
//	1-2. �Էµ� ���� Ȧ����� 3�� ���ϰ� 1�� ���մϴ�. 
//	2. ����� ���� ���� ���� �۾��� 1�� �� ������ �ݺ��մϴ�. 
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