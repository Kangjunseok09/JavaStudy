package 방과후.week3;

public class 자동Super {
    public static void main(String[] args) {

        A1 a1 = new A1();
        System.out.println();
        A1 a2 = new A1(3);
        System.out.println();
        B1 b1 = new B1();
        System.out.println();
        B1 b2 = new B1(3);

    }
}

class A1{
    A1(){
        this(3);
        System.out.println("A 생성자 1");
    }
    A1(int a){
        System.out.println("A 생성자 2");
    }
}

class B1 extends A1{
    B1(){   // super()가 생략됨
        this(3);
        System.out.println("B 생성자 1");
    }
    B1(int a){  // super()가 생략됨
        System.out.println("B 생성자 2");
    }
}
