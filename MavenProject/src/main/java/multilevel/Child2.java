package multilevel;

public class Child2 extends Child1 {
	public void place()
	{
		System.out.println("Child2 class");
	}

	public static void main(String[] args) {
		Child2 c2=new Child2();
		c2.name();
		c2.place();
		c2.date();

	}

}
