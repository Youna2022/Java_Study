package Study02;

import java.util.Arrays;

public class ArrPlus {

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		// arr1 ={{1,2,3},{2,3,4}};
		// arr2 ={{3,5,6},{1,3,6}};
		// answer = {{3,5},{}}
		int[][] answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
//	 i=0, j=0	answer[0][0] = arr1[0][0] = 1 + arr2[0][0] = 3
//	 i=0, j=1	answer[0][1] = arr1[0][1] = 2 + arr2[0][1] = 5
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		System.out.println(Arrays.deepToString(solution(arr1, arr2)));
	}

}

//길이는 500을 넘지 않습니다.
//행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//arr1					arr2			return
//[[1,2],[2,3]]	   [[3,4],[5,6]]	[[4,6],[7,9]]
//[[1],[2]]     	[[3],[4]]		[[4],[6]]