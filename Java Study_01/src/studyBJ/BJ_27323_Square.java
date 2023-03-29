package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_27323_Square {

//	직사각형 >> 입력값 * 입력값 
//	문제
//	정수 A, B 가 주어진다. 
//	세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 cm2 단위로 구하시오.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numA = Integer.parseInt(br.readLine());
		int numB = Integer.parseInt(br.readLine());
		
		System.out.println(numA * numB);
	}

}
