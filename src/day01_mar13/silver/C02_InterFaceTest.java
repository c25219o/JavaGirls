package day01_mar13.silver;

import java.util.function.Function;

class MyFunc implements Function<String, String> {

	@Override
	public String apply(String str) {
		return "java-" + str;
	}
}

public class C02_InterFaceTest {

	public static void main(String[] args) {
		MyFunc obj = new MyFunc();
		String str = obj.apply("jo");
		System.out.println(str);
	}

}
