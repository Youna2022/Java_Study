package Study02;

import java.util.Arrays;

public class TreasureMap {
//  둘다 공백 : 공백  둘중 하나라도 벽(#) : 벽   
//	n	5
//	arr1	[9, 20, 28, 18, 11]
//	arr2	[30, 1, 21, 17, 28]
//	출력	["#####","# # #", "### #", "# ##", "#####"]
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
//        int [] Integer.toBinaryString(i)
        String[] arr1two = new String[n];   // arr1two[0] + arr2two[0] {null, }
        String[] arr2two = new String[n]; // 01001     11110   >> 12111 0z
        for(int i = 0; i < n; i++) {
        	arr1two[i] = "";
        	arr2two[i] = "";
        	answer[i] = "";
        	int a = Integer.parseInt(Integer.toBinaryString(arr1[i]));
        	int b = Integer.parseInt(Integer.toBinaryString(arr2[i]));
        	String bi = String.valueOf(a + b);
//        	if(bi.length() < n) {
//        		for(int j = 0; j < n - bi.length(); j++) {
//        			bi = "0" + bi;
//        		}
//        	}
//        	for(int j = n - 1; j >= 0 ; j--) {
//        		if(bi.charAt(j) != '0') {
//        			answer[i] = "#" + answer[i];
//        		} else {
//        			answer[i] = " " + answer[i];
//        		}
//        	}
        	for(int j = bi.length() - 1; j >= 0 ; j--) {
        		if(bi.charAt(j) != '0') {
        			answer[i] = "#" + answer[i];
        		} else {
        			answer[i] = " " + answer[i];
        		}
        	}
//        	if(Integer.toBinaryString(arr1[i]).length() != n) {
//        		for(int j = 0; j < n-Integer.toBinaryString(arr1[i]).length(); j++) {
//            		arr1two[i] += "0";
//            	}
//        	}
//        	arr1two[i] += Integer.toBinaryString(arr1[i]);
//        	
//        	if(Integer.toBinaryString(arr2[i]).length() != n) {
//        		for(int j = 0; j < n-Integer.toBinaryString(arr2[i]).length(); j++) {
//        			arr2two[i] += "0";
//        		}
//        	}
//        	arr2two[i] += Integer.toBinaryString(arr2[i]);
        	
//        	answer[i] = "";
//        	for(int j = 0; j < n; j++) {
//        		if(arr1two[i].charAt(j) == '1' || arr2two[i].charAt(j) == '1') {
//        			answer[i] += "#";
//        		} else {
//        			answer[i] += " ";
//        		}
//        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
		
		
	}

}
