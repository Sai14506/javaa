class A
{
	A()
	{
		System.out.println("I am constructor of A ");
	}
}
class B extends A
{
	B()
	{
		System.out.println(" I am constructor of B ");
	}
}
class C extends B
{
	C()
	{
		System.out.println(" I am constructor of C ");
	}
}
public class ConstructorChain
{
	public static void main(String[] args)
	{
		C c=new C();
	}
}
