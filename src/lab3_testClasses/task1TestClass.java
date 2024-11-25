package lab3_testClasses;
import task1_classes.*;

public class task1TestClass {
	public static void main(String args[]) {
//		Flyable bird = new Bird();
//		Flyablel airplane = new Airplane();
//		bird.fly();
//		airplane.fly();
	
		Animal dog = new Dog("Max",Colors.BLUE.toString());
		Animal cat = new Cat("Barsik",Colors.BLUE.toString());
		
		dog.makeSound();
		dog.sleep();
		
		cat.makeSound();
		cat.sleep();
	}
}
