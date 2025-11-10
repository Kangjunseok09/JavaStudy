package 방과후.week9.homework;

public class no4 {
    public static void main(String[] args) {

        //todo : A의 abc() 메서드 안에 B를 새롭게 생성하여 반환하도록 구현해 보세요.
        D d = E::new;
    }
}


interface D{
    E abc();
}

class E {
    E(){}
}
