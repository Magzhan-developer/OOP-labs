package task1_classes;

public interface Flyable { // в интерфейсах нельзя использовать throws которая в классах говорила бы что тело класса может выкинуть ошибку
	int flySpeed = 150; // в интерфейсах если создаем значение(variable) то тут надо сразу же инициализировать
	int hoursToArrive = 2;
	//в интерфейсах нету конструктора
	void fly(); // до java-8 нельзя было прописывать реализацию метода но с java-8 если хочешь релизовать метод надо использовать ключевое слово default
	
	default int getDistance() {
		return flySpeed * hoursToArrive;
	}
	
}
