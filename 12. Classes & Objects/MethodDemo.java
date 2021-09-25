import java.io.*;
class Person
{
	private String name;
	private int age;
	void accept() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name: ");
		name=br.readLine();
		System.out.print("Enter Age: ");
		age=Integer.parseInt(br.readLine());
	}
	void check()
	{
		if(age<=30)
			System.out.println(name+" is Young.");
		else if(age<=50)
			System.out.println(name+" is Middle Aged.");
		else
			System.out.println(name+" is Old.");
	}
}
class MethodDemo
{
	public static void main(String args[]) throws IOException
	{
		Person obj=new Person();
		obj.accept();
		obj.check();
	}
}