package Study02;

import java.util.Arrays;

public class minLectangle {
	
//	[[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//    60, 50   70, 30    60,30      80,40            70   50
//  모든 가로가 길다 : 80  50 
	
    public static int solution(int[][] sizes) {
        int maxA = 0;
        int maxB = 0;
        for(int i = 0; i < sizes.length; i++) {
        	Arrays.sort(sizes[i]);
        	maxA = Math.max(maxA,sizes[i][0]);
        	maxB = Math.max(maxB,sizes[i][1]);
        }
        return maxA*maxB;
    }
    
    
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(sizes));
		
	}

}
