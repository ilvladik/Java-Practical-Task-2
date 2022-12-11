package exercise_5;

import java.util.ArrayList;

public class DogKennel {
    private ArrayList<Dog> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public void addDog(String name, int age) {
        Dog dog = new Dog(name, age);
        dogs.add(dog);
    }

    public void delDog(String name, int age) {
        dogs.removeIf(dog -> (dog.getName().equals(name) && dog.getAge() == age));
    }

    public Dog find(String name, int age) {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name) && dog.getAge() == age) {
                return dog;
            }
        }
        return null;
    }
}
