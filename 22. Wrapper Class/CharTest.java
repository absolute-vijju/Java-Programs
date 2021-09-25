import java.io.*;
class CharTest
{
	public static void main(String args[]) throws IOException
	{
		char ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("Enter a character: ");
			ch=(char)br.read();
			System.out.println("You entered: ");
			if(Character.isDigit(ch))
				System.out.print("a digit");
			else if(Character.isUpperCase(ch))
				System.out.println("an uppercase letter");
			else if(Character.isLowerCase(ch))
				System.out.println("a lowercase letter");
			else if(Character.isSpaceChar(ch))
				System.out.println("a spacebar character");
			else if(Character.isWhitespace(ch)){
			System.out.println("a whitespace character");
			return;
			}
		
		else System.out.println("Sorry! I don't know that.");
		br.skip(2);
		}
	}
}