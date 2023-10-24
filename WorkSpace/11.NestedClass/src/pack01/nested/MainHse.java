package pack01.nested;

import pack01.nested.HseNested.TestC.TestZ;
import pack01.nested.HseNested.TestC.TestZ.TestB;

public class MainHse {
	public static void main(String[] args) {
		
		
		
		HseNested hse = new HseNested();
	 TestB test =HseNested.TestC().new TestZ().new TestB();
	
	
	}
}
