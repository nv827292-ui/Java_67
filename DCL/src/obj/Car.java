package obj;

public class Car {
	void start() {
		System.out.println("car started");
	}
	void ShiftGear(int gn)
	{
		System.out.println("Gear shifted to"+gn+"gear");
		if(gn==0)
		{
			stop();
		}
	}
	void stop()
	{
		System.out.println("car stopped");
	}

}
