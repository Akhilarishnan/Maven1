package superkeyword;

public class Child_Class extends Parent_Class {
	int a=7;
	public void name()
	{
		
		super.name1();
		System.out.println("Child class");
		System.out.println(super.a);//instance variable of parent class
		System.out.println(a);//instance variable of child class
	}
	public Child_Class()
	{
		super();
		System.out.println("Constructor of child class");
	}

	public static void main(String[] args) {
		
		 Child_Class c1=new  Child_Class();
		 c1.name();
	}

}
