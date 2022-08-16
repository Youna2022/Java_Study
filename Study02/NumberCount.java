package Study02;

import java.util.ArrayList;

//예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자
//
//10 = 1, 0
//11 = 1, 1
//12 = 1, 2
//13 = 1, 3
//14 = 1, 4
//15 = 1, 5
//
//그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개

public class NumberCount {

	public static void main(String[] args) {
		
		ArrayList<String> numList = new ArrayList<>();
	      int[] numCnt = new int[10];
	      for(int i = 10; i < 16; i++) {
	         String num = String.valueOf(i);
	         String[] numArr = num.split("");
	         for(int j = 0; j < numArr.length; j++) {
	            numList.add(numArr[j]);
	         }
	      }
	      
	      for(int i = 0; i < numList.size(); i++) {
	         switch(numList.get(i)) {
	         case "1":
	            numCnt[1]++;
	            break;
	         case "2":
	            numCnt[2]++;
	            break;
	         case "3":
	            numCnt[3]++;
	            break;
	         case "4":
	            numCnt[4]++;
	            break;
	         case "5":
	            numCnt[5]++;
	            break;
	         case "6":
	            numCnt[6]++;
	            break;
	         case "7":
	            numCnt[7]++;
	            break;
	         case "8":
	            numCnt[8]++;
	            break;
	         case "9":
	            numCnt[9]++;
	            break;
	         case "0":
	            numCnt[0]++;
	            break;
	         default:
	         }
	      }
	      
	      for(int i = 0; i < numCnt.length; i++) {
	         System.out.println(i + " : " + numCnt[i]);
	      }
		
	}

}
