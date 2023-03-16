package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFactors2 {

//	약수들의 합
	
// 다른버전 >>성능이 더 좋다 
//문자를 합칠때 BufferedReader 나 StringBuffer를 쓰는게 좋
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int num = Integer.parseInt(br.readLine());
			if(num == -1) {
				break;
			}
			StringBuffer sb = new StringBuffer();
			
			sb.append(num);
			sb.append(" = ");
			int sum = 0;

			
			for(int i = 1; i <= num / 2; i++) {
				if(num % i == 0) {
					sb.append(i);
					sum += i;
					
					if(i != num / 2) {
						sb.append(" + ");
					}
				}
			}
			
			if(sum != num) {
				sb.delete(String.valueOf(num).length(), sb.length());
				sb.append(" is NOT perfect.");
			}
			System.out.println(sb.toString());
			
		}
	}

}
