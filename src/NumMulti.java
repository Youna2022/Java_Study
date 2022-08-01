
public class NumMulti {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 18; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("¹è¼öÀÇ ÃÑÇÕ : " + sum);
	}
}
