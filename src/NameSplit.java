import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSplit {

	public static void main(String[] args) {
		String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] array = str.split(",");
		int Kcnt = 0;
		int Lcnt = 0;
		int Jcnt = 0;

		for (int i = 0; i < array.length; i++) {
			if ("김".equals(array[i].substring(0, 1))) {
				Kcnt++;

			} else if ("이".equals(array[i].substring(0, 1))) {
				Lcnt++;
			}
			if ("이재영".equals(array[i])) {
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

		System.out.print("김씨 : " + Kcnt + "  ");
		System.out.print("이씨 : " + Lcnt);
		System.out.println();
		System.out.print("이재영은 : " + Jcnt + "명");
		System.out.println();
		System.out.print(list);
		System.out.println();
		Collections.sort(list);
		System.out.print("오름차순 : " + list);
	}
}
