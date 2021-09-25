import java.io.*;
class Sample
{
	double a,b;
	void sum() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter First Value for Sum: ");
		a=Double.parseDouble(br.readLine());
		System.out.print("Enter Second Value for Sum: ");
		b=Double.parseDouble(br.readLine());
		double c=a+b;
		System.out.print("Sum of Two Values: "+c);
	}
}
class Sum
{
	public static void main(String args[]) throws IOException
	{
		Sample obj=new Sample();
		obj.sum();
	}
}