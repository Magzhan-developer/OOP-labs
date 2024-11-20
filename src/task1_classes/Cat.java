package task1_classes;

public class Cat extends Animal{

	public Cat(String name,String color) {
		super(name,color);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}
