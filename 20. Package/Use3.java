import pack.Addition;
import pack.Substraction;
class Use3
{
	public static void main(String args[])
	{
		Addition obj=new Addition(10,10.5);
		obj.sum();
		double res=Substraction.sub(10,10.5);
		System.out.println("Substraction= "+res);
	}
}