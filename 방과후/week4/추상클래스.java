package 방과후.week4;

public class 추상클래스 {
    public static void main(String[] args) {

        taeeun t1  = new taeeun();

        t1.study();

        onetwo o1 = new onetwo() { // 익명 이너 클래스
            @Override
            void study() {
                System.out.println("ㅎㅎ");
            }
        };
        o1.study();
    }
}

abstract class onetwo{
    String name;

    abstract void study();

}

class taeeun extends onetwo{

    @Override
    void study() {
        System.out.println("프론트엔드 개발자 태은");
    }
}

class junsuk extends onetwo{
    @Override
    void study() {
        System.out.println("세탁기 견습생");
    }
}
