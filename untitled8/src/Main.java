abstract class bank {
    abstract int getRateOfInterest();
}

class SBI extends bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class Testbank {
    public static void main(String[] args){
        bank b;
        b= new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest());
        b= new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest());
    }
}