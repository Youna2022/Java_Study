package studyBJ;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_3009_FourthPoint {

//	네 번째 점
//	문제	:	세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
//
//	입력	:	세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
//			5 5
//			5 7
//			7 5
//	출력	:	직사각형의 네 번째 점의 좌표를 출력한다.	>>	7 7
	
//	처음 코드 : 15980	152 ms
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int[] arrX = new int[3];
//		int[] arrY = new int[3];
//		
//		for(int i=0; i < 3; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			arrX[i] = Integer.parseInt(st.nextToken());
//			arrY[i] = Integer.parseInt(st.nextToken());
//		}
//		br.close();
//		
//		bw.write(findPont(arrX) + " " + findPont(arrY));	//버퍼에 있는 값 전부 출력
//		
//		bw.flush();   //남아있는 데이터를 모두 출력시킴
//		bw.close();   //스트림을 닫음
//	}
//	
//	private static int findPont(int [] arr) {
//		if(arr[0] == arr[1]) {
//			return arr[2];
//		}else {
//			return arr[0] == arr[2] ? arr[1] : arr[0];
//		}
//	}
	
	
	/* 성능개선  : 14256	128 ms*/ 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arrX = new int[3];
		int[] arrY = new int[3];
		
		for(int i=0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arrX[i] = Integer.parseInt(st.nextToken());
			arrY[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		sb.append(findPont(arrX)).append(' ').append(findPont(arrY));	
		System.out.println(sb);
	}
	
	private static int findPont(int [] arr) {
		if(arr[0] == arr[1]) {
			return arr[2];
		}else {
			return arr[0] == arr[2] ? arr[1] : arr[0];
		}
	}

}
