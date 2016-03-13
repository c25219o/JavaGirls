package day01_mar13.silver;

public class C01_MatchCatchTest {

	public static void main(String[] args) {
		int[] x = {0, 1, 2, 3, 4};
		try {
			System.out.println(x[5]);
			System.out.println(x[4]);

		}catch(Exception e){
			System.out.println("exception 1");

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("exception 2");

		}finally{
			System.out.println("after");
		}

	}

}
