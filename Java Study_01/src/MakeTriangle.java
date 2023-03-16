
public class MakeTriangle {

	private static int solution(int[] sides) {
        int answer = 0;
        
        for(int i = 1; i <= 3; i++) {
            for(int j = 0; j < 3; j++) {
            	if((j+1) < 3) {
            		if(sides[j] < sides[j+1]) {
            			int sidesMax = sides[j];
            			sides[j] = sides[j+1];
            			sides[j+1] = sidesMax;
            		}
            		
            	}
            }
        }
        answer = ((sides[2] + sides[1]) > sides[0]) ? 1 : 2;
          
        return answer;
    }
	
	public static void main(String[] args) {
		int[] sides = {199, 72, 222};
		
		System.out.println("result ==> " + solution(sides));
		
	}

}

//sides	result
//[1, 2, 3]	2
//[3, 6, 2]	2
//[199, 72, 222]	1