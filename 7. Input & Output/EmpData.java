import java.io.*;
class EmpData
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Id: ");
		int id=Integer.parseInt(br.readLine());
		System.out.print("Gender(M/F): ");
		char sex=(char)br.read();
		//br.readLine().charAt(0);
		br.skip(2);
		System.out.print("Enter Name: ");
		String name=br.readLine();
		System.out.println("Id: " + id);
		System.out.println("Gender: " + sex);
		System.out.println("Name: " + name);
	}
}