package Study02;

import java.awt.print.Printable;
import java.util.HashSet;

public class ArrayTest {

//	for���� if,else���� ����ؼ� ���� ū��,���� ������, �߰����� �����ϱ�
//	����) int [] array= {1,2,3,4,5}
//	����¿���:
//	���� ū ���� 5 �Դϴ�.
//	���� ���� ���� 1�Դϴ�.
//	�߰����� 3�Դϴ�.

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();

		while (true) {
			int num = (int) (Math.random() * 50) + 1;
			hs.add(num);
			if (hs.size() == 5)
				break;
		}

		int[] array = new int[hs.size()];
		int z = 0;
		for (Integer arr : hs) {
			array[z] = arr;
			z++;
		}
		int max = 0;
		int min = 100;
		int mid = 0;

		for (int j = 0; j < array.length; j++) {
			if (array[j] > max)
				max = array[j];
			if (array[j] < min)
				min = array[j];
		}
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[i];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		System.out.println(hs);
		System.out.println(max);
		System.out.println(min);
		System.out.println(array[2]);
	}
}
