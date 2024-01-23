package examples.polymorphism;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("I am Dog");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
