package Study02;

import java.util.ArrayList;

//���� 10 ~ 15 ������ �� ������ ������ ���غ���
//
//10 = 1, 0
//11 = 1, 1
//12 = 1, 2
//13 = 1, 3
//14 = 1, 4
//15 = 1, 5
//
//�׷��Ƿ� �� ����� ���� 0:1��, 1:7��, 2:1��, 3:1��, 4:1��, 5:1��

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
