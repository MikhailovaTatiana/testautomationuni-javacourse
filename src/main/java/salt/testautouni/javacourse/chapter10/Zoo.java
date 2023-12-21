package salt.testautouni.javacourse.chapter10;

public class Zoo {
    public static void main(String[] args) {
        // Dog rocky = new Dog();
        // rocky.fetch();
        // rocky.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();
        ((Dog) sasha).fetch();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal) {

        if(animal instanceof Dog) {
            System.out.println("Here is your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here is your cat food");
        }
    }
}
