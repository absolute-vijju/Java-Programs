import java.io.*;

class BankAcct{
	private double bal;
	BankAcct(double b)
	{
		bal=b;
	}
	void contact(double r) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Password: ");
		String passwd=br.readLine();
		if(passwd.equals("vijju@123")) {
			Interest in=new Interest(r);
			in.calculateInterest();
		}
		else
		{
			System.out.print("Sorry! Your are not authorized person.");
		}
	}
	private class Interest{
		private double rate;
		Interest(double r) {
			rate=r;
		}
		void calculateInterest()
		{
			double interest=bal*rate/100;
			bal+=interest;
			System.out.print("Updated Balance: " + bal);
			System.out.print("\nInterest is:  " + interest );
		}
	}
}

public class Inner {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Salary: ");
		double sal=Double.parseDouble(br.readLine());
		BankAcct account=new BankAcct(sal);
		System.out.print("Enter Interest(In Percentage): ");
		double inte=Double.parseDouble(br.readLine());
		account.contact(inte);
	}

}
