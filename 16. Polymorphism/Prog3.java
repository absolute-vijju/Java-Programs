class One
{
	static void calculate(double x)
	{
		System.out.println("Square: " + (x*x));
	}
}
class Two extends One
{
	static void calculate(double x)
	{
		System.out.println("Square root: " + Math.sqrt(x));
	}
}
class Prog3
{
	public static void main(String args[])
	{
		One obj=new Two();
		obj.calculate(25);		
	}
}