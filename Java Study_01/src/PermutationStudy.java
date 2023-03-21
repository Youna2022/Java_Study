
public class PermutationStudy {

	/*
	 * 알고리즘 공부_ 순열구하기
	 * 
	 * 순열의 개수
	 *  nPk = n! / (n-k)!
	 */
	
//	public static void main(String[] args) {
//		int num1 = 4, num2 = 3;
//		System.out.println("순열의 개수? " + getNumP(num1, num2));
//		
//	}
//
//	private static int getNumP(int num1, int num2) {
//		return factorial(num1) / factorial(num1-num2);
//	}
//	
//	private static int factorial(int i) {
//		if(i <= 1) {
//			return 1;
//		} else {
//			return i * factorial(i-1);
//		}
//	}
	
	/*
	 * 순열만들기 
	 */
	public static void main(String[] args) {
		String str = "1234";
		
		permutation("", str);
	}

	private static void permutation(String s1, String s2) {
		if(!s1.equals("")) {
			System.out.println(Integer.valueOf(s1));
		}
		
		for(int i = 0; i < s2.length(); i++) { // 0
			permutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
		}
	}
	
	
	
	
	
	
	
	
	
}
