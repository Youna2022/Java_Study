package studyBJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
	
//	윤년 
//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
//하지만, 2000년은 400의 배수이기 때문에 윤년이다.
// 2000 1999

public class LeapYear {

	public static void main(String[] args) throws Exception{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int year = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			answer = 1;
		}
		System.out.println(answer);
	}
//	아래처럼도 가능 
//	public static void main(String[] args) throws Exception{
//		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int year = Integer.parseInt(br.readLine());
//		int answer = 0;
//		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			answer = 1;
//		}
//		System.out.println(answer);
//	}
	
//		이건 잘한사람 코드 
//	  public static void main(String[] args) throws IOException{
//	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        
//	        int x = Integer.parseInt(br.readLine());
//	        
//	        if(x%400==0) {
//	            System.out.print(1);
//	        } else if(x%4==0 && x%100!=0) {
//	            System.out.print(1);
//	        } else {
//	            System.out.print(0);
//	        }
//	    }
}
