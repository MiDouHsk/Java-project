class Animal{
    void eat() {
        System.out.println("eating...");
    }
}

class Dogs extends Animal{
    void eat() {
        System.out.println("eating bread...");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("eating Rat...");
    }
}

class lion extends Animal {
    void eat() {
        System.out.println("eating meat ...");
    }
}

class TestPolymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Cat();
        a.eat();
        a = new Dogs();
        a.eat();
        a = new lion();
        a.eat();
    }
}