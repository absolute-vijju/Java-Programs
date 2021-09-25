import java.io.*;
class Employee
{
	int id;
	String name;
	Employee(int i,String n)
	{
		id=i;
		name=n;
	}
	void displaydata()
	{
		System.out.println(id+"\t"+name);
	}
}
class Group
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of Employee: ");
		int n=Integer.parseInt(br.readLine());
		Employee arr[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Id: ");
			int id=Integer.parseInt(br.readLine());
			System.out.print("Enter Name: ");
			String name=br.readLine();
			arr[i]=new Employee(id,name);
		}
		System.out.println("---------- Employee's Details ----------");
		System.out.println("ID \t Name ");
		for(int i=0;i<n;i++)
		{
			arr[i].displaydata();
		}
	}
}