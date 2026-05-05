abstract class LivingThing {

    // method biasa
    public void breath() {
        System.out.println("Bernafas melalui hidung.");
    }

    public void eat() {
        System.out.println("Makan melalui mulut.");
    }

    // abstract method
    public abstract void walk();
}

// class Human
class Human extends LivingThing {

    // implementasi method walk
    public void walk() {
        System.out.println("Berjalan dengan 2 kaki.");
    }
}

// class Cat
class Cat extends LivingThing {

    // implementasi method walk
    public void walk() {
        System.out.println("Berjalan dengan 4 kaki.");
    }
}

// main class
public class MakhlukHidup {

    public static void main(String[] args) {

        Human Manusia = new Human();
        Cat Kucing = new Cat();

        System.out.println("Manusia :");
        Manusia.breath();
        Manusia.eat();
        Manusia.walk();

        System.out.println();

        System.out.println("Kucing :");
        Kucing.breath();
        Kucing.eat();
        Kucing.walk();
    }
}