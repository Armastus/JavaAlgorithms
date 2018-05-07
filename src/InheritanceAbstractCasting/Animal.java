package InheritanceAbstractCasting;

public abstract class Animal {
    private int age;  // VS private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("An animal is sleeping.");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        // What happens if...
        // Dog o = new Animal(3);
        // Animal o = new Dog();
        // IT FAILS!

        // casting
        Object dog = new Dog();
        ((Dog) dog).ruff();
        // Below is another way of casting.
//        Dog newDog = (Dog) dog;
//        newDog.ruff();
        // EX: Using strings.
//        Object str = "str";
//        String realS = (String) str;
//        realS.// this gives me access to all string methods now.

        // What happens when...
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
            // doggy overwrites animal methods.
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    }

}
