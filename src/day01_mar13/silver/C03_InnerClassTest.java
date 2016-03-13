package day01_mar13.silver;

import java.util.function.Function;

public class C03_InnerClassTest {

	public static void main(String[] args) {
		Function<String, String> str = new Function<String, String>() {
			@Override
			public String apply(String t) {
				return "java-" + t;
			}
		};

		System.out.println(str.apply("jo"));
	}

}
