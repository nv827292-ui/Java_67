package obj;

public class Student {
	String name;
	int age;
	float height;
	void setData(String name,int age,float height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setData("rama", 20, 5.11f);
		System.out.println(s.name+" "+s.age+" "+s.height);

	}

}
