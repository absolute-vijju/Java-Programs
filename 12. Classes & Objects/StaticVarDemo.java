class Test
{
	static int x=10;
	void Display()
	{
		System.out.print(x);
	}
}
class StaticVarDemo
{
	public static void main(String args[])
	{
		Test obj1=new Test();
		Test obj2=new Test();
		++obj1.x;
		System.out.print("X in Object 1: ");
		obj1.Display();
		System.out.print("X in Object 2: ");
		obj2.Display();
	}
}