class Animal{
    void eat() {
        System.out.println("Animal eating...");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
//        super.eat();
        System.out.println("Dog eating bones...");
    }
}

class BabyDog extends Dog {
    public static void main(String args[]) {
        Animal a = new BabyDog();
        a.eat();
    }
}