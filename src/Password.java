import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		System.out.println("입력하세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		double num = Double.parseDouble(str);
		
		double sqrtnum = Math.sqrt(num);
		
		
		
		System.out.println((int)(sqrtnum*1000)-(int)num);
		
	}

}
