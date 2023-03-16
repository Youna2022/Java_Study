import java.util.Arrays;

public class ListLength {

	private static int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] += (strlist[i].length());
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		System.out.println("result ==> " + solution(strlist)[0]);
		
	}

}

//strlist	result
//["We", "are", "the", "world!"]	[2, 3, 3, 6]
//["I", "Love", "Programmers."]	[1, 4, 12]