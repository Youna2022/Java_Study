package Study02;

public class PersonEx {

	public static void main(String[] args) {
		Person person1 = new Person(111, "김준수"); //생성자가 하나라서 (int id, String name)
		Person person2 = new Person(112, "김준타");
//		Person person3 = new Person(111, "김준타");
		
		if (person1.equals(person2)) System.out.println("같다");
		else System.out.println("다르다");
	}

}