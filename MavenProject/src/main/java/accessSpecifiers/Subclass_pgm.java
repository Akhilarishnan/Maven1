package accessSpecifiers;

public class Subclass_pgm {

	public static void main(String[] args) {
		Main_Pgm m2=new Main_Pgm();	
		m2.publicmethod();
		m2.defaultmethod();
		m2.protectedcmethod();
		//m2.privatemethod();couldnot access

	}

}
