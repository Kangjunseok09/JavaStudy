package 방과후.week2;

public class 생성자 {
    public static void main(String[] args) {
        Ulsan jo =  new Ulsan();
        jo.UlsanCom();
        jo.name = 100;
        System.out.println(jo.name);
    }
}
class Ulsan{
    int name;
    int whale;

    void UlsanCom(){
        System.out.println("sout");
    }

    Ulsan(){
        name = 1;
        whale = 1;
    }
}
