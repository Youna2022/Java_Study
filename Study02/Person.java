package Study02;

public class Person {
	int		id;	// Key
	String	name;

	public Person (int id, String name) {
		this.id		= id;
		this.name	= name;
		
	}
	
	@Override      //return�� /���� ���� ����.
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Person	p = null;
		boolean b = false;
		
		// instanceof < ��ü��
		if(obj instanceof Person)		
			p = (Person) obj;
		if(obj != null && this.id == p.id && this.name == p.name)	
			b = true;
		// this id>person1 / p.id > person2 <<�Ķ����
		// �̱���?
		
		return b; // boolean > ���������� ���������.

	}

}