abstract class Car
{
	int regno;
	Car(int r)
	{
		regno=r;
	}
	void openTank()
	{
		System.out.println("Fill the tank");
	}
	abstract void steering(int direction,int angle);
	abstract void breaking(int force);
}
class Maruti extends Car
{
	Maruti(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This is ordinary steering");
	}
	void breaking(int force)
	{
		System.out.println("Breaks applied");
		System.out.println("These are hydraulic breaks");
	}
}
class Santro extends Car
{
	Santro(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This is power steering");
	}
	void breaking(int force)
	{
		System.out.println("Breaks applied");
		System.out.println("These are gas breaks");
	}
}
class UseCar
{
	public static void main(String args[])
	{
		Maruti m=new Maruti(1001);
		Santro s=new Santro(5005);
		Car ref;
		ref=m;
		ref.openTank();
		ref.steering(1,90);
		ref.breaking(500);
	}
}