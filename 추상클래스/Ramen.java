package 추상클래스;

public class Ramen extends Food{
    public Ramen(){
        super("라면");
    }

    @Override
    void cook(){
        System.out.println("물에 면과 스프를 넣고 끓입니다.");
    }

    public static void main(String[] args) {
        Ramen ramen = new Ramen();
        ramen.serve();
        ramen.cook();
    }
}
