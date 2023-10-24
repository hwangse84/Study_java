package pack01.nested;

import pack01.nested.Nested.NesInner;
import pack01.nested.Nested.NesInner2;

public class NastedMain {
	public static void main(String[] args) {
		Nested.field2 = 10;// static은 항상 메모리에 먼져 올라가는 성질있음=클래스.
		Nested.method2();

		Nested nas = new Nested();
		nas.field = 20;
		nas.method();

		NesInner nes = nas.new NesInner();
		nes.iField = "KYM";
		nes.iMethod();
		// NesInner naa =nest.new Nested.new NesInner();

		System.out.println(Nested.NesInner2.sField2);

		NesInner2 nes2 = new Nested.NesInner2();
		nes2.iField = "KIM";
		nes2.iMethod();

	}
}
