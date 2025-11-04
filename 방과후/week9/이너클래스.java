package 방과후.week9;

public class 이너클래스 {
    public static void main(String[] args) {
        A.B b = new A.B();
        b.bbb();
    }
}

class A{
    public static int a = 4;
    private static int b = 5;

    public void bcd(){
        System.out.println("A의 bcd 메서드");
    }

    static class B{
        public void bbb(){
            System.out.println(a+b);
        }
    }
}
