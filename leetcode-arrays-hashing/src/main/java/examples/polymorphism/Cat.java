package examples.polymorphism;

public class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("I am Cat");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
