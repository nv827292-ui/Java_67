package obj;

public class Test1 {
	void meth(int x,double y) {
		System.out.println("meth1 is exec");
	}
	void meth(double y) {
		System.out.println("Meth2 is exec");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		t.meth(0.0);

	}

}
