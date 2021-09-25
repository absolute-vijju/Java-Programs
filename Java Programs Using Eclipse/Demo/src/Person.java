import java.io.*;
public class Person {
	private String name;
	private int age;
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	public void check()
	{
		if(age<=30)
			System.out.println(name+ " is Young");
		else if(age<=50)
			System.out.println(name+ " is Middle Aged");
		else
			System.out.println(name+ " is Old");
	}
}
class Demo{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your name: ");
		String n=br.readLine();
		System.out.print("Enter Your Age: ");
		int a=Integer.parseInt(br.readLine());
		Person p=new Person(n,a);
		p.check();
	}
}
