package task1_classes;

public abstract class Animal {

	String name;
	double weight;
	String color;
	
	public Animal(String name,String color) { // тут можно использовать конструктор
		this.name = name;
		this.color = color;
	}
	
	public abstract void makeSound(); // в абстрактных классах можно оставить метод без реализации
	
	public void sleep() { // можно спокойно реализовать методы
		System.out.println("Animal is sleeping");
	}
}
