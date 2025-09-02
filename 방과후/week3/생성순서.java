package 방과후.week3;

public class 생성순서 {
    public static void main(String[] args) {

        A a = new A();
//        B b = new A(); 부모가 먼저 생성되고 A()가 생성됨
        A c = new B();

    }
}

class A{}

class B extends A{}

class C extends B{}

class D extends B{}

