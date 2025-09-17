interface Shape
{
	double getArea();
}
class Rectangle implements Shape
{
	private double length;
	private double width;
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double getArea()
	{
		return length * width;
	}
}
class Circle implements Shape
{
	private double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return Math.PI * radius* radius;
	}
}
public class ShapeDemo
{
	public static void main(String[] args)
	{
		Shape rec = new Rectangle(10.1,14.0);
		Shape cir = new Circle(2);
		System.out.println(" Area of Rectangle is :" +rec.getArea());
		System.out.println(" Area of Circle is :" +cir.getArea());
	}
}
	
