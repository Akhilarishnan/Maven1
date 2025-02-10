package singleInheritance;

public class Child extends Parent{
	public void inheritance()
	{
		System.out.println("Method of child class");
	}
	

	public static void main(String[] args) {
		Child c =new Child();
		c.name();
		c.inheritance();

	}

}
