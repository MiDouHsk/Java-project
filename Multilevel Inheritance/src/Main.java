class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Dog {
    void Weep() {
        System.out.println("Weeping...");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.Weep();
        d.eat();
        d.bark();
    }
}