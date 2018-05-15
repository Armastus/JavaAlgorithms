package InheritanceAbstractCasting;

public class Cat extends Animal {

    public Cat() {
        super(7);
        System.out.println("A cat has been created");
    }

    public void eat() {
        System.out.println("A cat is eating.");
    }

    // Uncommenting this will do a override of the sleep method in the parent method (Animal).
//    public void sleep() {
//        System.out.println("A cat is sleeping.");
//    }

    public void meow() {
        System.out.println("A cat meows!");
    }

    public void prance() {
        System.out.println("A cat is prancing");
    }

}
