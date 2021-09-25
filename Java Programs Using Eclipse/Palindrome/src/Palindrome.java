import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String: ");
		String str=br.readLine();
		String tmp=str;
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		str=sb.toString();
		if (tmp.equalsIgnoreCase(str)) {
			System.out.println(tmp + " is Palindrome.");
		}
		else
		{
			System.out.println(tmp + " is not Palindrome.");
		}
	}

}
