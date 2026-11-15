package obj;

public class Airtel {
	void card(String cardno,double amount) {
		System.out.println("card number="+cardno);
		System.out.println("Amount="+amount);
	}
	void upi(String id,double amount) {
		System.out.println("UPI Id="+id);
		System.out.println("Amount="+amount);
	}
	void netbanking(String bankname,String accno,double amount) {
		System.out.println("Bank Name="+bankname);
		System.out.println("Account number="+accno);
		System.out.println("Amount="+amount);
	}

	public static void main(String[] args) {
		Airtel r=new Airtel();
		r.card("76hyi", 350);
		r.upi("8123@ybl", 700);
		r.netbanking("bank of baroda","342t66", 890);
		// TODO Auto-generated method stub

	}

}
