package 방과후.week3;

public class Super {
    public static void main(String[] args) {

        ABC2 b = new ABC2();

        b.bcd();

    }
}

class ABC1{
    void abc(){
        System.out.println("1 클래스 abc()");
    }
}

class ABC2 extends ABC1{
    void abc(){
        System.out.println("2 클래스 abc()");
    }
    void bcd(){
        super.abc();
    }
}

class ABC3 extends ABC2{
    void abc(){
        System.out.println("3 클래스 abc()");
    }

    void bcd(){
        super.bcd();
    }
}

