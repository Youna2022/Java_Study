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
	   Random r = new Random();
	   String answer = strArr[r.nextInt(strArr.length-1)+1];
	   return answer;
	   
//	   int rnd = new Random().nextInt(strArr.length);
//	   return strArr[rnd];
   }
   public static String getScrambledWord(String str) {
	 char[] chArr = str.toCharArray();
	 
	 for(int i = 0; i < str.length(); i++) {
		 int idx = (int)(Math.random()*str.length());
		 
		 char tmp = chArr[i];
		 
		 chArr[i] = chArr[idx];
		 chArr[idx] = tmp;
	 }
	 	return new String(chArr);

   } // scramble(String str)
}
