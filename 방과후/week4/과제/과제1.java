package 방과후.week4.과제;

public class 과제1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}

abstract class Animal{
    String name;
    abstract void sound();

}

class Dog extends Animal{


    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("야옹");
    }
}
