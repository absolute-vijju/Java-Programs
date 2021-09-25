class Shape
{
	protected double l;
	Shape(double l)
	{
		this.l=l;
	}
}
class Square extends Shape
{
	Square(double l)
	{
		super(l);
	}
	void area()
	{
		System.out.println("Area of Square= "+(l*l));
	}
}
class Rectangle extends Square
{
	private double b;
	Rectangle(double x,double y)
	{
		super(x);
		b=y;
	}
	void area()
	{
		System.out.println("Area of Rectangle= "+(l*b));
	}
}
class Inherit
{
	public static void main(String args[])
	{
		Square s=new Square(5.5);
		s.area();
		Rectangle r=new Rectangle(5.5,6);
		r.area();
	}
}