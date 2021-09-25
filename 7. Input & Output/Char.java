import java.io.*;
class Char
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Character: ");
		char ch=(char)br.read();
		System.out.println("You Entered: " + ch);
	}
}