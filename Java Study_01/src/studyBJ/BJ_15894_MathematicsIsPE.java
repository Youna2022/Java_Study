package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ_15894_MathematicsIsPE {

//	수학은 체육과목 입니다
//			한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다. 
//			가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오.
//	입력	:	첫 번째 줄에 가장 아랫부분의 정사각형 개수 n이 주어진다. (1 ≤ n ≤ 109)
//
//	출력	:	첫 번째 줄에 형석이가 말해야 하는 답을 출력한다.
	
	
//	항상 *4가된다. 1 = 4	2= 8. 4+(3+2+1-2)	3 = 12. 8 + (4+2+1 - 3)  4 = 16	  12 + (5+2+1 - 4)  
//	처음코드 	:	17692	212 ms  >> (성능 매우 안좋다..)
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long num = sc.nextLong();
//		
//		System.out.println(num*4);
//		
//	}
	
//	수정 코드 : 14200	124 ms >>> BufferedReader 를 사용해야한다.   왜??
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		
		System.out.println(num*4);
		
	}

}
