package task2_classes;

public class Truck implements Transportable{
	 @Override
	 public void move() {
		 System.out.println("Truck is moving");
	 }

	 @Override
	 public void load() {
		 System.out.println("Loading cargo onto the truck");
	 }

	 @Override
	 public void unload() {
		 System.out.println("Unloading cargo from the truck");
	 }
}
