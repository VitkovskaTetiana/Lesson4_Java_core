package Animal;

public class Main {
	public static void main(String[] arg) {
		Animal animal = new Animal("Cat", 30, 3);

		animal.animalInfo(animal.getName(), animal.getSpeed(), animal.getAge());

		animal.setName("Cow");
		animal.setSpeed(8);
		animal.setAge(5);
		

		animal.animalInfo(animal.getName(), animal.getSpeed(), animal.getAge());
		animal.animalInfo("Bird", 40, 2);
	}
}
