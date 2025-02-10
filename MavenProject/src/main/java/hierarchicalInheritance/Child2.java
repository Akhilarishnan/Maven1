package hierarchicalInheritance;

public class Child2 extends Parent{
	public void place()
	{
		System.out.println("Constructor Child class");
	}

	public static void main(String[] args) {
		Child2 c2=new Child2();
		c2.place();
		c2.Name();
		

	}

}
