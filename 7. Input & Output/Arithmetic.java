import java.io.*;
import java.util.*;
class Arithmetic
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamAdapter(System.in));
		System.out.print("Enter Two Numbers: ");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str,",");
		String s1=st.nextToken();
		String s2=st.nextToken();
		s1=s1.trim();
		s2=s2.trim();
		double n1=Double.parseDouble(s1);
		double n2=Double.parseDouble(s2);
		System.out.println("Addition: " + (n1+n2));
		System.out.println("Substraction: " + (n1-n2));
		System.out.println("Multipication: " + (n1*n2));
		System.out.println("Division: " + (n1/n2));
	}
}