package 방과후.week9.homework;

public class no2 {
    public static void main(String[] args) {

        // todo : A의 abc 메서드에 B의 bcd를 호출하는 코드를 작성해봅시다.
        B b = C::bcd;
        b.abc();
    }
}



interface B{
    void abc();
}

class C {
    static void bcd(){
        System.out.println("메서드 bcd");
    }
}

