package studyBJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pallindromNumber {


//	팰린드롬수
	
//	어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다. 'radar', 'sees'는 팰린드롬이다.
//	수도 팰린드롬으로 취급할 수 있다. 수의 숫자들을 뒤에서부터 읽어도 같다면 그 수는 팰린드롬수다. 
//	121, 12421 등은 팰린드롬수다. 123, 1231은 뒤에서부터 읽으면 다르므로 팰린드롬수가 아니다. 
//	또한 10도 팰린드롬수가 아닌데, 앞에 무의미한 0이 올 수 있다면 010이 되어 팰린드롬수로 취급할 수도 있지만, 
//	특별히 이번 문제에서는 무의미한 0이 앞에 올 수 없다고 하자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String num = br.readLine();
			if("0".equals(num)) {
				break;
			}
			
			String answer = "";
			String a = num.substring(0,num.length()/2);
			String b = num.substring(num.length()%2 == 0 ? num.length()/2 : (num.length()/2) + 1);
			
			boolean trueFalse = true;
			
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) != b.charAt(a.length()-1-i)) {
					trueFalse = false;
					break;
				}
			}
			answer = trueFalse ? "yes" : "no"; 
			System.out.println(answer);
			
		}
	}

}
