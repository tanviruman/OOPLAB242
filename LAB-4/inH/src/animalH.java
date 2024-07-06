public class animalH {
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends animalH {
    void bark() {
        System.out.println("Barking");

    }
}
class BabyDog extends Dog {
    void cry() {
        System.out.println("crying");

    }
}

class Test1{

    public static void main(String[] args) {
        BabyDog d= new BabyDog();
        d.bark();
        d.eat();
        d.cry();

    }
}



