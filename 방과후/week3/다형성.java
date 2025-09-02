package 방과후.week3;

public class 다형성 {
    public static void main(String[] args) {

        hyungmin leeh = new hyungmin();

        System.out.println(leeh.age);

        Human h1 = new Human();

        h1.eat();

        leeh.eat();

        Human h2 = new hyungmin();

//        System.out.println(h2.baekjoon_tier);
        h2.eat();   // 메서드 오버라이딩
        // 필드는 오버라이딩이 안됌

    }
}

class Human {
    String age;
    String name;

    void breathe(){
        System.out.println("숨쉬어요");
    }

    void eat(){
        System.out.println("밥먹어요");
    }
}

class hyungmin extends Human {

    String baekjoon_tier;
    void eat(){
        System.out.println("형민이 밥먹어요");
    }
}
