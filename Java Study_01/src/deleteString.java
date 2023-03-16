
public class deleteString {

	 private static String solution(String my_string, String letter) {
	        String answer = "";
	        
	        for(int i = 0; i < my_string.length(); i++) {
	        	if(my_string.charAt(i) != letter.charAt(0)) {
	        		answer += my_string.charAt(i);
	        	}
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		String my_string = "BCBdbe";
		String letter = "B";
		System.out.println("result ->> " + solution(my_string, letter));

	}

}

//my_string	letter	result
//"abcdef"	"f"	"abcde"
//"BCBdbe"	"B"	"Cdbe"