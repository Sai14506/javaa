class Parent 
{
	int num=100;
			// parent class constructor
	Parent()
	{
		System.out.println("Parent class constructor called");
	}
	void diaplay()
	{
		System.out.println("Parent class method");
	}
}
class Child extends Parent
{
	int num=200;
			// child class constructor
	Child()
	{
			// call to parent class
		super();
		System.out.println("Child class constructor called");
	}
	void show()
	{
			// Accessing child and parent variables
		System.out.println("Child num:"+num);
		System.out.println("Parent num using super:"+super.num);
			// Calling parent class method super.display
	}
}
public class SuperKeywordExample
{
	public static void main(String[] args)
	{
		Child obj=new Child();
		// class parent constructor frist 
		obj.show();
	}
}
