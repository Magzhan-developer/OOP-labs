package lab3_testClasses;
import task2_classes.*;

public class task2TestClass {

	public static void main(String[] args) {
		Moveable car = new Car();
        Transportable truck = new Truck();
        car.move();

        truck.move(); 
        truck.load(); 
        truck.unload();
	}

}
