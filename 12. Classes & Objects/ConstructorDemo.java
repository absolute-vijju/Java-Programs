class Person
{
	private String name;
	private int age;
	Person()
	{
		name="Raju";
		age=30;
	}
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	void talk()
	{
		System.out.println();
		System.out.println("My name is "+name+".");
		System.out.println("My age is "+age+".");
	}
}
class ConstructorDemo
{
	public static void main(String args[])
	{
		Person Raju=new Person();
		Raju.talk();
		Person Sita=new Person("Sita",30);
		Sita.talk();
	}
}