import java.io.*;
class BankAcct
{
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
		if(passwd.equals("xyz123"))
		{
			Interest in=new Interest(r);
			in.calculateinterest();
		}
		else
		{
			System.out.print("Sorry! You are not authorized person.");
			return;
		}
	}
	private class Interest
	{
		private double rate;
		Interest(double r)
		{
			rate=r;
		}
		void calculateinterest()
		{
			double interest=bal*rate/100;
			bal+=interest;
			System.out.print("Updated Balance: " +bal);
		}
	}
}
class InnerClass
{
	public static void main(String args[]) throws IOException
	{
		BankAcct account=new BankAcct(10000);
		account.contact(9.5);
	}
}