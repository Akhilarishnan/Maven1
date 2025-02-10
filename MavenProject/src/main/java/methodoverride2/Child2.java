package methodoverride2;

public class Child2 extends Parent1 {
	public void Date(String a)

	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Child2 c1=new Child2 ();
		c1.Date("over");
	}

}
