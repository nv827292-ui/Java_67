package obj;

public class Instagram {
	void login(String gmail,String password)
	{
		System.out.println(gmail+" "+password);
	}
	void login(String username,String password,int phno) {
		System.out.println(username+" "+password);
	}
	void login(int phno,int otp) {
		System.out.println(phno+" "+otp);
	}
	public static void main(String[] args) {
		Instagram i=new Instagram();
		i.login("n@12.gmail.com", "9876y");
		i.login("nan12_", "9876y",8122);
		i.login(81233,999);
		
	}

}
