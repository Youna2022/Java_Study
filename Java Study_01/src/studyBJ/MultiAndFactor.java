package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//배수와 약수

//두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
//
//첫 번째 숫자가 두 번째 숫자의 약수이다.
//첫 번째 숫자가 두 번째 숫자의 배수이다.
//첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.

//입력
//입력은 여러 테스트 케이스로 이루어져 있다.
//각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.

//출력
//각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를,
//배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.

public class MultiAndFactor {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			String [] strArr = str.split(" ");
			
			int num1 = Integer.parseInt(strArr[0]);
			int num2 = Integer.parseInt(strArr[1]);
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			
			String answer = num2 % num1 == 0 ? "factor" : num1 % num2 == 0 ? "multiple" : "neither";
			System.out.println(answer);
			
		}
	}
}
