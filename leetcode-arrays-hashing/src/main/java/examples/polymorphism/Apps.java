package examples.polymorphism;

public class Apps {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        AnimalBarbershop barbershop = new AnimalBarbershop();

        barbershop.trim(cat);
        barbershop.trim(dog);
    }
}
