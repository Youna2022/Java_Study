

import java.util.Random;


public class WordScrambleEx1 {

	public static void main(String[] args) {
		 String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

         String answer = getAnswer(strArr);
         String question = getScrambledWord(answer);

         System.out.println("Question:"+question);
         System.out.println("Answer:"+answer);
   } // main

   public static String getAnswer(String[] strArr) { 
	   Random i = new Random();
	   int index = i.nextInt(strArr.length);
	   System.out.println(strArr[index]);
	   return null;
	   
	   
   }
   public static String getScrambledWord(String str) {
	   
	   return str; 
//	   List<String> letters = Array.asList(String.split(""));
//	   Collection.shuffle

   } // scramble(String str)
}
