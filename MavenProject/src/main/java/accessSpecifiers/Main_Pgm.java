package accessSpecifiers;

public class Main_Pgm {
	public void publicmethod()
		{
		System.out.println("It is public method");
		}
		private void privatemethod()
			{
				System.out.println("It is private method");
			}
			protected void protectedcmethod()
				{
					System.out.println("It is protected method");
				}
				void defaultmethod()
				{
					System.out.println("It is default method");
				}
	public static void main(String[] args) 
		{
		Main_Pgm m1=new Main_Pgm();
		m1.publicmethod();
		m1.privatemethod();
		m1.protectedcmethod();
		m1.defaultmethod();
		}
}

	


