import java.io.*;
class ParseInteger
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an Int Value: ");
		int num=Integer.parseInt(br.readLine());
		System.out.println("You entered: "+num);
	}
}