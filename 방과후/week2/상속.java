package 방과후.week2;

import java.sql.Struct;

public class 상속{
    public static void main(String[] args) {

        Student s = new Student();
        s.bob();
        s.gog();

        System.out.println(s.age);
    }
}


class Human{

    String name;
    int age = 17;

    void bob(){
        System.out.println("밥먹어요");
    }

    void nap(){
        System.out.println("잠자요");
    }
}

class Dev extends Human{
    void gpt(){
        System.out.println("협박해요");
    }

    void comit(){
        System.out.println("커밋 충돌하면 지울거에요");
    }

    void gog(){
        System.out.println("구글링해요");
    }
}

class Student extends Dev{
    String department;
    String git_id;

    void coding(){
        System.out.println("코딩해요");
    }

    void shop(){
        System.out.println("매점가요");
    }
}