class Sample
{
	void sum(int a,int b)
	{
		System.out.println("Sum of Two number is: " + (a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("Sum of Three number is: " + (a+b+c));
	}
}
class Prog1
{
	public static void main(String args[])
	{
		Sample obj=new Sample();
		obj.sum(10,20);
		obj.sum(10,20,30);
	}
}