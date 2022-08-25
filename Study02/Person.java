package Study02;

public class Person {
	int		id;	// Key
	String	name;

	public Person (int id, String name) {
		this.id		= id;
		this.name	= name;
		
	}
	
	@Override      //return형 /내가 내껄 쓸게.
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Person	p = null;
		boolean b = false;
		
		// instanceof < 객체비교
		if(obj instanceof Person)		
			p = (Person) obj;
		if(obj != null && this.id == p.id && this.name == p.name)	
			b = true;
		// this id>person1 / p.id > person2 <<파라미터
		// 싱글톤?
		
		return b; // boolean > 리턴형으로 돌려줘야함.

	}

}