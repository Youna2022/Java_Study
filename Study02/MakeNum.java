package Study02;
//"try hello wold"	"TrY HeLlO WoRlD"
//toUpperCase¿Í toLowerCase
public class MakeNum {
    public static String solution(String s) {
        String answer = "";
        String [] str = s.split(" ", -1); //{"try", "hello","world"}
        for(int i = 0; i < str.length; i++) {
        	// str[0] = try
        	for(int j = 0; j < str[i].length(); j++) {
        		//0 1 2
        		answer += j % 2 == 0 ? str[i].substring(j, j+1).toUpperCase() : str[i].substring(j, j+1).toLowerCase(); 
        	}
        	if(i != str.length - 1) {
        		answer += " ";
        	}
       	}
		return answer;
        }
//        return word != null ? word.substring((word.length()-1)/2,(word.length()+2)/2) : "";
        	
//        return answer;
//    }
    
    
	public static void main(String[] args) {
		String s = "try hello world         ";
		System.out.println(solution(s));
		
	}

}
