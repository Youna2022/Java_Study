import java.util.Arrays;

public class DeptBudget {

	  public static int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        
	        for(int i = 0; i<d.length; i++) {
	        	
	        	if(d[i] <= budget) {
	        		budget = budget-d[i];
	        		answer++;
	        	}else {
	        		break;
	        	}
	        }
	        return answer;
	    }	
	
	public static void main(String[] args) {
		int[] d  = {5,1,2,5,4};
		int budget = 9;
		int answer = solution(d,budget);
		System.out.println(answer);
	}
}
//d	budget	result
//[1,3,2,5,4]	9	3
//[2,2,3,3]	10	4