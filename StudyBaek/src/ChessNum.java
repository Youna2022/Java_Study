import java.util.Scanner;

public class ChessNum {

//	ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8��
//	0 1 2 2 2 7
//	1 0 0 0 0 1
	public static void main(String[] args) {
		int[] find = new int[6];
		int[] chess = { 1, 1, 2, 2, 2, 8 };

		Scanner sc = new Scanner(System.in);

		find[0] = sc.nextInt();
		find[1] = sc.nextInt();
		find[2] = sc.nextInt();
		find[3] = sc.nextInt();
		find[4] = sc.nextInt();
		find[5] = sc.nextInt();

		for (int i = 0; i < chess.length; i++) {
			System.out.print(chess[i] - find[i] + " ");
		}
	}

}
