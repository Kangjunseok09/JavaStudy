package 방과후.week3;

public class 추상클래스 {
    public static void main(String[] args) {
        BB b = new BB();
        b.abc();
    }
}

abstract class AA{
    abstract void abc();
}

class BB extends AA{

    void abc(){
        System.out.println("ㅎㅇㅎㅇ");
    }
}