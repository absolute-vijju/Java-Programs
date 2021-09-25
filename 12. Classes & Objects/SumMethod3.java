import java.io.*;
class Sample
{
	double x,y;
	double Sum(double a,double b)
	{
		x=a;
		y=b;
		double c=a+b;
		return c;
	}
}
class SumMethod3
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a for Sum: ");
		double p=Double.parseDouble(br.readLine());
		System.out.print("Enter b for Sum: ");
		double q=Double.parseDouble(br.readLine());
		Sample obj=new Sample();
		double z=obj.Sum(p,q);
		System.out.print("Sum= "+z);
	}
}