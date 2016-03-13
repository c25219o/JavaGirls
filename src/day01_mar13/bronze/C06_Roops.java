package day01_mar13.bronze;

public class C06_Roops {

	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<Integer>();
//
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//
//		// error
////		while (false) {
////
////		}
//
//
//		do {
//			list.remove(2);
//
//		}while(false);
//
//
//		for(;;) {
//
//			//
//			break;
//
//		}
//
//		for(int num : list) {
//			System.out.println(num);
//		}
//
//		String[] str = {"J", "a", "v", "a"};
//		for(String s : str) {
//			System.out.println(s);
//		}

		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++)
				System.out.println("j = " + j);
			System.out.println("i = " + i);
		}


	}
}
