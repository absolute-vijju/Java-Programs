import java.io.*;
import java.util.Date;
class Employee implements Serializable
{
	private int id;
	private String name;
	private float sal;
	private Date doj;
	Employee(int i,String n,float s,Date d)
	{
		id=i;
		name=n;
		sal=s;
		doj=d;
	}
	void display()
	{
		System.out.print(id+"\t"+name+"\t"+sal+"\t"+doj);
	}
	static Employee getData() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee Id: ");
		int id=Integer.parseInt(br.readLine());
		System.out.print("Enter Name: ");
		String name=br.readLine();
		System.out.print("Enter Salary: ");
		float sal=Float.parseFloat(br.readLine());
		Date d=new Date();
		Employee e=new Employee(id,name,sal,d);
		return e;
	}
}
class StoreObj
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fos=new FileOutputStream("objfile");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		System.out.print("How many objects? ");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			Employee e1=Employee.getData();
			oos.writeObject(e1);
		}
		oos.close();
	}
}