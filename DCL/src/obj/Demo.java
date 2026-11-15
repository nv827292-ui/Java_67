package obj;

public class Demo {
	void add(int x,long y) {
		System.out.println("Method 1");
	}
	void add(long a,int b) {
		System.out.println("Method 2");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.add(10, 20);
	}

}
