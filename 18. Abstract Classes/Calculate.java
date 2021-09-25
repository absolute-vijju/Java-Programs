abstract class Plan
{
	protected double rate;
	public abstract void getRate();
	public void calculateBill(int units)
	{
		System.out.println("Bill amount for "+units+ " units: ");
		System.out.println(rate*units);
	}
}
class CommercialPlan extends Plan
{
	public void getRate()
	{
		rate=5;
	}
}
class DomesticPlan extends Plan
{
	public void getRate()
	{
		rate=2.60;
	}
}
class Calculate
{
	public static void main(String args[])
	{
		System.out.println("Commercial Connection: ");
		Plan p=new CommercialPlan();
		p.getRate();
		p.calculateBill(250);
		System.out.println("Domestic Connection: ");
		p=new DomesticPlan();
		p.getRate();
		p.calculateBill(150);
	}
}