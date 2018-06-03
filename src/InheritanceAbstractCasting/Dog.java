package InheritanceAbstractCasting;

public class Dog extends Animal {

    public Dog() {
        super(15);
        System.out.println("A dog has been created.");
    }

    // eat had to be implemented since it extends Animal and inherits
    // the eat abstract method.
    public void eat() {
        System.out.println("A dog is eating.");
    }

    public void sleep() {
        System.out.println("A dog is sleeping.");
    }


    public void ruff() {
        System.out.println("The dog says ruff");
    }

    public void run() {
        System.out.println("A dog is running");
    }

}
