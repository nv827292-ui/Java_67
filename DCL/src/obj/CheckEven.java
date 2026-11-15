package obj;

public class CheckEven {
	int even(int a)
	{
		if(a%2==0)
		{
			System.out.println("the given number is even");
		}
		else {
			System.out.println("the given number is odd");
		}
		return a;
		
	}
	public static void main(String[] args) {
		CheckEven e=new CheckEven();
		int a;
		a=6;
		e.even(a);
	}

}
