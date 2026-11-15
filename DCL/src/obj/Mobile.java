package obj;

public class Mobile {
	String brand="apple";
	double size=7.9;
	int price=89000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		Mobile m2=new Mobile();
		System.out.println(m);
		System.out.println(m2);
		System.out.println("mobile brand is "+m.brand);
		System.out.println("mobile price is "+m.price);
		System.out.println("mobile size is "+m.size);

	}

}
