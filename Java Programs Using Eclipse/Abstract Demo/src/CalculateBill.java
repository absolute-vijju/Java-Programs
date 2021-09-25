abstract class Plan{
	protected double rate;
	public abstract void getRate();
	public void calculateBill(int units) {
		System.out.println("Bill amount for " + units + " units: " + (rate*units));
	}
}

class CommercialPlan extends Plan{
	public void getRate() {
		rate=5.00;
	}
}

class DomesticPlan extends Plan{
	public void getRate() {
		rate=2.60;
	}
}


public class CalculateBill {

	public static void main(String[] args) {
		Plan p;
		System.out.println("Commercial Connection");
		p =new CommercialPlan();
		p.getRate();
		p.calculateBill(250);
		System.out.println("Domestic Connection");
		p =new DomesticPlan();
		p.getRate();
		p.calculateBill(150);
	}

}
