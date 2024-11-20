package lab3_testClasses;
import task3_classes.*;

public class task3TestClass {
	public static void main(String args[]) {
		MyCollection<String> stringCollection = new MyList<>();
		stringCollection.add("Hello");
        stringCollection.add("World");
        System.out.println(stringCollection.size());
        
//        MyCollection<Integer> integerCollection = new MyList<>();
//        integerCollection.add(10);
//        integerCollection.add(20);
//        System.out.println(integerCollection.size());
	}
}
