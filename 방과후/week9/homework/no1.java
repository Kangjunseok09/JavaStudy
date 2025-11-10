package 방과후.week9.homework;

public class no1 {
    public static void main(String[] args) {

        A a = String::length;

        System.out.println(a.abc("123456"));
    }
}



interface A{
    int abc(String str);
}
