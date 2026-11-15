package obj;

public class Driver {
	void drive() {
	Car c1=new Car();
	c1.start();
	c1.ShiftGear(1);
	c1.ShiftGear(3);
	c1.ShiftGear(5);
	System.out.println("Drives with high speed");
	c1.ShiftGear(0);


}
}
