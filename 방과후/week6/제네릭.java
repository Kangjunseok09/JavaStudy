package 방과후.week6;

public class 제네릭 {
    public static void main(String[] args) {


        mingil mg1 = new mingil();

        String str1 = mg1.<String>method("민길민길");
        Integer int1 = mg1.<Integer>method(5);
        System.out.println(str1);
        System.out.println(int1);
    }


}

class mingil{

    public <T> T method(T t){
        return t; // 오브젝트 함수만 올수 있음
    }

}

