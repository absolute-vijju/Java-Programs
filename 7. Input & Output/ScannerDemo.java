import java.util.Scanner;
class ScannerDemo
{
	public static void main(String args[])
	{
		System.out.print("Enter Id, Name & Salary: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		float sal=sc.nextFloat();
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + sal);
	}
}