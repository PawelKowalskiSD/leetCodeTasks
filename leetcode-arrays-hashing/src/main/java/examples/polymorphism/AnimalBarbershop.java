package examples.polymorphism;

public class AnimalBarbershop {
    public void trim(Animal animal) {
        animal.speak();
        System.out.println("it's done " + animal);
    }
}
