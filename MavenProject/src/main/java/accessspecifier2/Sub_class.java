package accessspecifier2;

import accessSpecifiers.Main_Pgm;

public class Sub_class extends Main_Pgm{//import main program

	public static void main(String[] args) {
		
Sub_class s1=new Sub_class();
s1.protectedcmethod();
s1.publicmethod();
//cannot be access default and private
	}

}
