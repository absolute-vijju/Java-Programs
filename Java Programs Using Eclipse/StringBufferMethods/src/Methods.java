import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		String sn="Koshti";
		String mn="Vijay";
		String ln="Dineshbhai";
//		System.out.println("Enter Surname: ");
//		String sur=br.readLine();
//		System.out.println("Enter Middlename: ");
//		String mid=br.readLine();
//		System.out.println("Enter Lastname: ");
//		String las=br.readLine();
		sb.append(sn);
		sb.append(ln);
		System.out.println(sb);
		int n=sn.length();
		sb.insert(n, mn);
		System.out.println("Full name: "+ sb);
		System.out.println("In reverse form: " +sb.reverse());
		
	}

}
