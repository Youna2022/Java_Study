package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_9063_Land {

//	문제	:	(2, 1), (3, 2), (5, 2), (3, 4) 네 점에서 옥구슬을 발견하였다면, 
//			임씨에게 돌아갈 대지는 (2, 1), (5, 1), (2, 4), (5, 4)를 
//			네 꼭짓점으로 하는 직사각형이며, 넓이는 (5 - 2) × (4 - 1) = 9 가 된다. 
//	
//	출력	:	첫째 줄에 N 개의 점을 둘러싸는 최소 크기의 직사각형의 넓이를 출력하시오. 	
//			>> 360
//	3
//	20 24
//	40 21
//	10 12
	
//	처음 코드 : 31208	412 ms
	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		int [] numX = new int [n];
//		int [] numY = new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			numX[i] = Integer.parseInt(st.nextToken());
//			numY[i] = Integer.parseInt(st.nextToken());
//		}
//		if(n == 1) {
//			System.out.println(0);
//			return;
//		}
//		
//		Arrays.sort(numX);
//		Arrays.sort(numY);
//		
//		System.out.println((numX[n-1]-numX[0])*(numY[n-1]-numY[0]));
//		
//	}
	
//	수 코드 : 27304	292 ms
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int minX = Integer.MAX_VALUE;	// 비교할 대상이므로 반대로 넣는다. 
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;	// 비교할 대상이므로 반대로 넣는다. 
		int maxY = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			if(minX > x) {
				minX = x;
			}
			if(maxX < x) {
				maxX = x;
			}
			if(minY > y) {
				minY = y;
			}
			if(maxY < y) {
				maxY = y;
			}
		}
		if(n == 1) {
			System.out.println(0);
			return;
		}
		
		System.out.println((maxX - minX) * (maxY - minY));
		
	}

}
