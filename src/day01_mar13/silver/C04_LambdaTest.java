package day01_mar13.silver;

import java.util.function.Function;

public class C04_LambdaTest {

	public static void main(String[] args) {


		Function<String, String> obj = (String str) -> {
			return "java-" + str;
		};

		String str = obj.apply("jo");
		System.out.println(str);
	}

}
