package lab3_testClasses;
import task3_classes.*;

public class task3TestClass {
	public static void main(String args[]) {
		MyCollection<String> stringCollection = new MyList<>(true,false);
		stringCollection.add("Hello");
        stringCollection.add("World");
        stringCollection.add("alabama");
        stringCollection.add("astana");
        stringCollection.add("heheh");
        stringCollection.add("barca");
        stringCollection.add("cansas");
        System.out.println(stringCollection.size());
        
        
        for (String x : stringCollection.getList()) {
        	System.out.print(x + " ");
        }
        
//        MyCollection<Integer> integerCollection = new MyList<>();
//        integerCollection.add(10);
//        integerCollection.add(20);
//        System.out.println(integerCollection.size());
	}
}
