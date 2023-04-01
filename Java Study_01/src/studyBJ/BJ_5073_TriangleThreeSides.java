package studyBJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_5073_TriangleThreeSides {
	
	/*
	 * 문제	:	삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
	 * 			Equilateral : 세 변의 길이가 모두 같은 경우 
	 * 			Isosceles : 두 변의 길이만 같은 경우 
	 * 			Scalene : 세 변의 길이가 모두 다른 경우 
	 * 			단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다.
	 * 			예를 들어 6, 3,2가 이 경우에 해당한다.
	 *  		가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
	 * 			세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
	 * 
	 * 입력	:	각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다. 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다.
	 * 
	 * 출력	:	각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.
	 * 
	 * 테스트:	7 7 7	/	6 5 4	/	3 2 5			Equilateral	/	Scalene	/	Invalid
	 * 
	 * 푸는 과정:	출력할때 하나씩 sysout으로 출력할지, StringBuilder에 append 할지 고민했다.
	 * 			append 출력시 원하는 모양이 나오지 않았다.
	 * 			BufferedWriter 를 사용하여 입력 받은 값의 결과를 한번에 나오게(0 0 0 입력시) 하도록 구현
	 * 
	 * 제출	:		14040	116 ms
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
				
				if(a == 0 && b == 0 && c ==0) {
					break;
				}
				
				int maxNum = Math.max(Math.max(a, b), Math.max(a, c));
				
				if(maxNum < a+b+c-maxNum) {
					if(a == b && a == c && b == c) {
						bw.write("Equilateral" + "\n");
//						sb.append("Equilateral").append("\n");
					} else if(a == b || b == c || a == c) {
						bw.write("Isosceles" + "\n");
//						sb.append("Isosceles").append("\n");
					} else {
						bw.write("Scalene" + "\n");
//						sb.append("Scalene").append("\n");
					}
				} else {
					bw.write("Invalid" + "\n");
//					sb.append("Invalid").append("\n");
				}
			
		}
		bw.flush();
		bw.close();
		
		
		
	}
}
