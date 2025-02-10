package methodOverriding;

public class Chilc_Class extends Parent_Class{
	public void name()//method overriding
	{
		super.name();//override parent class
		System.out.println("Method of child classs");
	}

	public static void main(String[] args) {
		Chilc_Class c1=new Chilc_Class();
		c1.name();
		// TODO Auto-generated method stub

	}

}
