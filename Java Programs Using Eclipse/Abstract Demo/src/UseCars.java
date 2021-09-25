abstract class Car{
	static int regno;
	public Car(int r) {
		regno=r;
	}
	void openTank() {
		System.out.println("Fill the Tank");
	}
	abstract void steering();
	abstract void breaking();
}

class Maruti extends Car{
	public Maruti() {
		super(regno);
	}
	void steering() {
		System.out.println("Take a turn.");
		System.out.println("This is Ordinary Steering.");
	}
	void breaking() {
		System.out.println("Breaks Applied.");
		System.out.println("These are Hydrauic Breaks.");
	}
}

class Santro extends Car{
	public Santro() {
		super(regno);
	}
	void steering() {
		System.out.println("Take a turn.");
		System.out.println("This is Power Steering.");
	}
	void breaking() {
		System.out.println("Breaks Applied.");
		System.out.println("These are Gas Breaks.");
	}
}

public class UseCars {

	public static void main(String[] args) {
		Maruti m=new Maruti();
		Santro s=new Santro();
		Car ref;
		ref=m;
		ref.openTank();
		ref.steering();
		ref.breaking();
	}

}
