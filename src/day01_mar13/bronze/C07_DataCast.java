package day01_mar13.bronze;

public class C07_DataCast extends C {

	public static void main(String[] args) {
		C c = new C();
		A a = (D)c;

		System.out.println(a.toString());


		byte byteNum1 = 1;
		int intNum1 = byteNum1;

		int intNum2 = 2;
		byte byteNum = (byte)intNum2;
	}

}

interface A {}

class B implements A{}
class C extends B{}
class D extends C{}
