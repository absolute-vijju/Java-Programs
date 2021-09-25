class Person
{
	private String name;
	private int age;
	void setName(String name)
	{
		this.name=name;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
}
class Methods
{
	public static void main(String args[])
	{
		Person obj=new Person();
		obj.setName("Vijay");
		obj.setAge(18);
		System.out.println("Your name is: " + obj.getName());
		System.out.println("Age : " + obj.getAge());
	}
}