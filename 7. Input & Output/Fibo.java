import java.io.*;
class Fibo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number for Fibonaccies: ");
		int n=Integer.parseInt(br.readLine());
		long a,b;
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);
		long c=a+b;
		System.out.println(c);
		int count=3;
		while(count<n)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			count++;
		}
	}
}