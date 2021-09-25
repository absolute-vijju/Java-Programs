class MyClass
{
	int x;
	MyClass(int x)
	{
		this.x=x;
	}
}
class Compare
{
	public static void main(String args[])
	{
		MyClass obj1=new MyClass(10);
		MyClass obj2=new MyClass(10);
		Integer obj3=new Integer(10);
		Integer obj4=new Integer(10);
		if(obj1.equals(obj2))
			System.out.println("obj1 & obj2 are same.");
		else
			System.out.println("obj1 & obj2 are not same.");
		if(obj3.equals(obj4))
			System.out.println("obj3 & obj4 are same.");
		else
			System.out.println("obj3 & obj4 are not same.");
	}
}