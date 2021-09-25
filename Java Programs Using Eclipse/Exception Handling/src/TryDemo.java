import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryDemo {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Number: ");
			int a=Integer.parseInt(br.readLine());
			System.out.println("You Entered: " + a);
			
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("Enter Only Integer Value");
		}
		finally {
			System.out.print("Thank You");
		}
	}

}
