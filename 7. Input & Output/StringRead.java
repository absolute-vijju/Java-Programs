import java.io.*;
class StringRead
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Name: ");
		String name=br.readLine();
		System.out.println("Your name is: "+name);
	}
}