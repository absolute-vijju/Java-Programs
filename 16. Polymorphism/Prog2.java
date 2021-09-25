class One
{
	void calculate(double x)
	{
		System.out.println("Square: "+(x*x));
	}
}
class Two extends One
{
	void calculate(double x)
	{
		System.out.println("Square root: "+Math.sqrt(x));
	}
}
class Prog2
{
	public static void main(String args[])
	{
		Two obj=new Two();
		obj.calculate(25);
	}
}