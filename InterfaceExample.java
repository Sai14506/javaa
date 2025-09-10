interface Vehicle
{
	void start();
	void stop();
}
class Car implements Vehicle
{
	public void start()
	{
		System.out.println(" car is start with the key ");
	}
	public void stop()
	{
		System.out.println(" car is stop ");
	}
}
class Bike implements Vehicle
{
	public void start()
	{
		System.out.println(" Bike is start with the key ");
	}
	public void stop()
	{
		System.out.println(" Bike is stop ");
	}
}
public class InterfaceExample
{
	public static void main(String[] args)
	{
		Vehicle v1=new Car();
		v1.start();
		v1.stop();
		Vehicle v2=new Bike();
		v2.start();
		v2.stop();
	}
}
