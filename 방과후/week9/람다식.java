package 방과후.week9;

public class 람다식 {

    public static void main(String[] args) {

        // todo : A의 abc 메서드에 len의 값 만큼 배열을 생성하는 동작을 구현해 봅시다.
        B b = int[]::new;
        b.abc(10);
    }
}



interface B{
    int[] abc(int len);
}

