package lab3_testClasses;
import task5_classes.*;

public class task5TestClass {
	public static void main(String args[]) {
		Chocolate[] chocolates = {
				new Chocolate("Milk Chocolate", 100.5),
				new Chocolate("Dark Chocolate", 80.2),
				new Chocolate("White Chocolate", 120.3),
				new Chocolate("Caramel Chocolate", 95.8)
		};

		System.out.println("\nДо сортировки:");
		for (Chocolate chocolate : chocolates) {
			System.out.println(chocolate);
		}

		Sort.bubbleSort(chocolates);

		System.out.println("\nПосле сортировки:");
		for (Chocolate chocolate : chocolates) {
			System.out.println(chocolate);
		}


		/*Time[] times = {
				new Time(12, 30, 45),
				new Time(9, 15, 30),
				new Time(18, 45, 10),
				new Time(23, 59, 59)
		};

		System.out.println("\nДо сортировки:");
		for (Time time : times) {
			System.out.println(time.toUniversal());
		}

		Sort.bubbleSort(times);

		System.out.println("\nПосле сортировки:");
		for (Time time : times) {
			System.out.println(time.toUniversal());
		}*/

	}
}
