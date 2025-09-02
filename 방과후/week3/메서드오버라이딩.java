package 방과후.week3;

public class 메서드오버라이딩 {
    public static void main(String[] args) {
        junwoo j = new junwoo();

        j.zolgi();

        hyosang h = new hyosang();

        h.zolgi();

        junwoo jh = new hyosang();

        jh.zolgi();
    }
}

class junwoo{
    static void zolgi(){
        System.out.println("준우 또 자요");
    }
}

class hyosang extends junwoo{

    static void zolgi(){
        System.out.println("효상이 또 자요");
    }
}


