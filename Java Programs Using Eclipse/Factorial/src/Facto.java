import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Facto {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Values For Factorial: ");
		int num=Integer.parseInt(br.readLine());
		System.out.print("Factorial of " +num + " :" +	Facto.factorial(num));
	}

	static long factorial(int num) {
		long result;
		if (num==1) {
			return 1;
		}
		result=factorial(num-1)*num;
		return result;
	}

}
