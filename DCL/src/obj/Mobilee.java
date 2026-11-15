package obj;

public class Mobilee {
	String brand="apple";
	int price=200000;
	int warranty=4;
	
	void payment()
	{
		System.out.println("payment done");
	}
	void take_picture()
	{
		System.out.println("picture clicked");
	}
	void text()
	{
		System.out.println("text forwarded");
	}
	public static void main(String[] args) {
		Mobilee m=new Mobilee();
		System.out.println(m.price);
		System.out.println(m.brand);
		System.out.println(m.warranty);
		m.payment();
		m.take_picture();
		m.text();
		
		
	}

}
