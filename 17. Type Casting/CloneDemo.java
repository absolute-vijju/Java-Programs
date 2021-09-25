class Employee implements Cloneable
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void getData()
	{
		System.out.println("Id: " +id);
		System.out.println("Name: " +name);
	}
	public Object myClone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class CloneDemo
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Employee e1=new Employee(1001,"Vijay Koshti");
		e1.getData();
		Employee e2=(Employee)e1.myClone();
		e2.getData();
	}
}