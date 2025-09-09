package 방과후.week4;

public class 인터페이스 {
    public static void main(String[] args) {

    }
}

interface flyable{
    void fly();
}

interface setak{

    void setak();
}

class haha implements flyable, setak{
    String name;

    @Override
    public void fly() {
        System.out.println("날아올라");
    }
    @Override
    public void setak() {
        System.out.println("나 세탁하고 올게 준우야!");
    }
}
