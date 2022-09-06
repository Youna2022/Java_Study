package Study02;

public class dartGame {
//		artResult	answer	설명
//	1	1S2D*3T		37		11 * 2 + 22 * 2 + 33	1 2*2
//	2	1D2S#10S	9		12 + 21 * (-1) + 101
//	S =1제곱		D=제곱	T=3제곱	점수마다 하나씩 존재,
//	옵션 : *=해당점수& 전점수를 2배	#=해당점수 -	점수마다 하나 존잭 or 존재X
//	* 중복가능. *# 가능->-2배
//	총점수 반환

	public static int solution(String dartResult) {
        int[] answer = new int[3];
        String[] numArr = dartResult.split("");
        int idx 	 = 0;
        String num = "";
        //1D2S#10S => {1,D,2,S,#,1,0,S}
        for(int i = 0; i < numArr.length; i++) {
        	switch(numArr[i]) {
        	
        	case "S":
        		answer[idx] = (int)Math.pow(Integer.parseInt(num), 1);
        		idx++;
        		num = "";
        		break;
        	case "D":
        		answer[idx] = (int)Math.pow(Integer.parseInt(num), 2);
        		idx++;
        		num = "";
        		break;
        	case "T":
        		answer[idx] = (int)Math.pow(Integer.parseInt(num), 3);
        		idx++;
        		num = "";
        		break;
        	case "*":
        		if(idx > 1) {
        			answer[idx - 2] *= 2;
        		}
        		answer[idx-1] *= 2;
        		break;
        	case "#":
        		answer[idx-1] *= -1;
        		break;
        	default:
        		num += numArr[i];
        		break;
        	}
        }
        
        return answer[0] + answer[1] + answer[2];
	}
	
	
	public static int solution1(String dartResult) {
		int answer = 0;
		char[] cc = dartResult.toCharArray();
		int[] score = { 0, 0, 0 };
		int cnt = 0; // 다트기회
		String sc = "";// 매 기회 점수

		for (int i = 0; i < cc.length; i++) {
			if (Character.isDigit(cc[i]) == true) {
				sc += cc[i];
			} else if (cc[i] == 'S' || cc[i] == 'D' || cc[i] == 'T') {
				score[cnt] = Integer.parseInt(sc);
				if (cc[i] == 'D')	score[cnt] *= score[cnt];
				if (cc[i] == 'T')	score[cnt] *= score[cnt] * score[cnt];
				
				if (i != cc.length-1) {
					if (cc[i + 1] == '*') {
						if (cnt != 0)
							score[cnt - 1] *= 2;
						score[cnt] *= 2;
					}
					if (cc[i + 1] == '#')
						score[cnt] *= (-1);
				}
				cnt++; // 다음기회로 넘어감
				sc = ""; // 점수 초기화
			}
		}
		for (int i : score) {
			answer += i;
		}
		return answer;
	}

	public static void main(String[] args) {
		String dart = "1S2D*3T";
		System.out.println(solution(dart));

	}

}
