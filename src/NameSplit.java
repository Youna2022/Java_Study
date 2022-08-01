import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSplit {

	public static void main(String[] args) {
		String str = "������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������";
		String[] array = str.split(",");
		int Kcnt = 0;
		int Lcnt = 0;
		int Jcnt = 0;

		for (int i = 0; i < array.length; i++) {
			if ("��".equals(array[i].substring(0, 1))) {
				Kcnt++;

			} else if ("��".equals(array[i].substring(0, 1))) {
				Lcnt++;
			}
			if ("���翵".equals(array[i])) {
				Jcnt++;
			}
		}

		List<String> namelist = Arrays.asList(array);
		List<String> list = new ArrayList<>();

		for (int i = 0; i < namelist.size(); i++) {
			if (!list.contains(namelist.get(i))) {
				list.add(namelist.get(i));
			}
		}

		System.out.print("�达 : " + Kcnt + "  ");
		System.out.print("�̾� : " + Lcnt);
		System.out.println();
		System.out.print("���翵�� : " + Jcnt + "��");
		System.out.println();
		System.out.print(list);
		System.out.println();
		Collections.sort(list);
		System.out.print("�������� : " + list);
	}
}
