
public class StrInStr {

    public static int solution(String str1, String str2) {
        int answer = 0;
        
        answer = str1.contains(str2) ? 1 :2;
        
        return answer;
    }
	
	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		int result = solution(str1, str2);
		System.out.println("result ==> " + result);
		
		
	}
	
//	str1	str2	result
//	"ab6CDE443fgh22iJKlmn1o"	"6CD"	1
//	"ppprrrogrammers"	"pppp"	2
//	"AbcAbcA"	"AAA"	2

}
