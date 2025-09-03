 class Parent 
 {
 	int num=100; 
 	// superclass member
 }
 class Child extends Parent
 {	
 	int num=200; //hides Parent 's num
 	void display()
 	{
 		System.out.println("Child class num:" +num);
 		 // refers to child's num
 		System.out.println("Parent class num:" + super.num);
 		 // refers to parent's num
 	}
 }
 public class MemberHidingDemo
 {
 	public static void main(String[] args)
 	{
 		Child obj= new Child();
 		obj.display();
 	}
 }
