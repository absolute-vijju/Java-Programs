import java.io.*;
class Sample
{
	private double a,b;
	double Sum() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a b For Sum: ");
		a=Double.parseDouble(br.readLine());
		b=Double.parseDouble(br.readLine());
		double c=a+b;
		return c;
	}
}
class SumMethod2
{
	public static void main(String args[]) throws IOException
	{
		Sample obj=new Sample();
		double x=obj.Sum();
		System.out.print("Sum= "+x);
	}
}