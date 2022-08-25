package Study02;

import java.util.ArrayList;
import java.util.Arrays;

//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,  ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
//[1,3,2,4,2]	[1,2,3]
// [1 3 5 2 1 2 2 4 3 4]
//  1 2 3 4 5 1 2 3 4 5
public class MathTest {
	
    public static int[] solution(int[] answers) {
        int[][] p = {
        		{1,2,3,4,5},
        		{2, 1, 2, 3, 2, 4, 2, 5},
        		{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        /*
         * 점수계산
         */
        int[] point = new int[3];
        for(int i=0; i<answers.length; i++) {
        	if(p[0][i % 5] == answers[i]) {
        		point[0] += 1;
        	}
        	if(p[1][i % 8] == answers[i]) {
        		point[1] +=1;
        	}
        	if(p[2][i % 10] == answers[i]) {
        		point[2] +=1;
        	}
        }
        
        /*
         * 가장 높은 점수 찾기
         */
        int hscore = Math.max(Math.max(point[0], point[1]),point[2]);
        
        //가장 높은 점수랑 같은 사람의 점수를 ArrayList에 넣어주기
        ArrayList<Integer> arr = new ArrayList<>();
        if(hscore == point[0]) {
        	arr.add(1);
        }
        if(hscore == point[1]) {
        	arr.add(2);
        }
        if(hscore == point[2]) {
        	arr.add(3);
        }
        //arr ==> 1, 3
        //answer 만들어주기 위함
        // { a, b}
        // 1 3
        int[] answer = new int [arr.size()];
        for(int i=0; i<answer.length; i++){
        	answer[i] = arr.get(i);
        }
        
        return answer;
        
    }
	public static void main(String[] args) {
		int[] ans = {2,4,5,2,5,4,1};
		System.out.println(Arrays.toString(solution(ans)));
		
		
	}

}
