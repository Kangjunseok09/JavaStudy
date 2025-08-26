package 방과후.week2;

public class 오버로딩 {
    public static void main(String[] args) {
        Mingil a = new Mingil(100);

    }
}


class Mingil{
    Mingil(){}

    Mingil(int a){
        for(int i = 0; i < a; i++) System.out.println("구른다");
    }

    Mingil(int a,int b){
        for(int i = 0; i < a+b; i++) System.out.println("구른다");
    }
}
