import java.io.*;
class Sample
{
	static double Sum(double a,double b) throws IOException
	{
		double c=a+b;
		return c;
	}
}
class StaticDemo
{
	public static void main(String args[]) throws IOException
	{
		//Sample obj=new Sample();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a for Sum: ");
		double p=Double.parseDouble(br.readLine());
		System.out.print("Enter b for Sum: ");
		double q=Double.parseDouble(br.readLine());
		double x=Sample.Sum(p,q);
		System.out.print("Sum= "+x);
	}
}