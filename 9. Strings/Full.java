import java.io.*;
class Full
{
	public static void main(String args[]) throws IOException
	{
		StringBuffer sb=new StringBuffer();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Surname: ");
		String sur=br.readLine();
		System.out.print("Enter Middlename: ");
		String mid=br.readLine();
		System.out.print("Enter Lastname: ");
		String las=br.readLine();
		sb.append(sur);
		sb.append(mid);
		System.out.println("Name: " + sb);
		int n=sur.length();
		sb.insert(n,mid);
		System.out.println("Full name: " +sb);
		System.out.println("In Reverse: " +sb.reverse());
	}
}