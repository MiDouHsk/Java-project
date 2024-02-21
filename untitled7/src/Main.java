class Animal {
    public void eat() {
        System.out.println("eating...");
    }
    public void run() {
        System.out.println("Running...");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Con cho Gam Xuong...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        Dog.eat();
    }
}
