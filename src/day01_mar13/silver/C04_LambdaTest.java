package day01_mar13.silver;

import java.util.function.Function;

public class C04_LambdaTest {

	public static void main(String[] args) {

		Function<String, String> obj1 = (String str) -> { //str karihikisuu
			return "java-" + str;
		};

		Function<String, String> obj2 = (str) -> {
			return "java-" + str;
		};

		Function<String, String> obj3 = str -> {
			return "java-" + str;
		};

		Function<String, String> obj4 = str -> "java-" + str;

		String str1 = obj1.apply("jo");
		System.out.println(str1);

		String str2 = obj2.apply("jo");
		System.out.println(str2);

		String str3 = obj3.apply("jo");
		System.out.println(str3);

		String str4 = obj4.apply("jo");
		System.out.println(str4);
	}

}
