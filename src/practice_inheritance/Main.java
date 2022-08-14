package practice_inheritance;

public class Main {
	
    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);
	    System.out.println(animal.getName());
        Dog dog = new Dog("Bruno", 8, 20, 2, 4, 1, 20, "long silky");
        System.out.println(dog.getName());
        System.out.println(animal.getName());
//        dog.eat();
        dog.walk();
//        dog.run();

    }


}
