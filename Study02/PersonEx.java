package Study02;

public class PersonEx {

	public static void main(String[] args) {
		Person person1 = new Person(111, "���ؼ�"); //�����ڰ� �ϳ��� (int id, String name)
		Person person2 = new Person(112, "����Ÿ");
//		Person person3 = new Person(111, "����Ÿ");
		
		if (person1.equals(person2)) System.out.println("����");
		else System.out.println("�ٸ���");
	}

}