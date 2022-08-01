import java.util.Random;
import java.util.Scanner;

public class WordScrambleEx1 {

	public static void main(String[] args) {
		 String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

         String answer = getAnswer(strArr);
         String question = getScrambledWord(answer);

         Scanner sc = new Scanner(System.in);
         
         
         while(true) {
             System.out.println("Question :" + question);
             System.out.print("Your answer is :"); 
             String str = sc.nextLine();
//             System.out.println(str);
             
             if(str.equals("q") || str.equals("Q")) {
            	 System.out.println("--------����--------");
            	 break;
             }
             
             if(answer.equals(str)) {
            	 System.out.println("�����Դϴ�");
            	 answer = getAnswer(strArr);
                 question = getScrambledWord(answer);
             } else {
            	 System.out.println(str + "��/�� �����̾ƴմϴ�. �ٽ� �õ��غ�����.");
             }

             // 1. ȭ���� ���� ������� �Է��� �޴´�.(ScannerŬ���� ���)
             // 2. ����ڰ� q �Ǵ� Q�� �Է��ϸ� ���α׷��� �����Ѵ�.
             // 3. ����ڰ� ������ ���⶧���� �ݺ��ϴٰ�
             //     ����ڰ� ������ ���߸�, while���� ����������.
             //
             //Question :HEOP
//             Your answer is :phoe
//             phoe��/�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.
//             Question :HEOP
//             Your answer is :hope
//             �����Դϴ�.
       } // while

 } // main
	  public static String getAnswer(String[] strArr) {
          int idx = (int)(Math.random()*strArr.length);
          return strArr[idx];
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