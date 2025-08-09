package 인터페이스;

interface Cookable {
    void cook();
    void serve();
}

class Pizza implements Cookable {

    static int count = 0;

    public Pizza() {
        count++;
    }

    @Override
    public void cook(){
        System.out.println("오븐에서 피자를 구웁니다.");
    }

    @Override
    public void serve(){
        System.out.println("피자를 손님에게 제공합니다.");
    }
}

class Ramen implements Cookable{

    static int count = 0;

    public Ramen() {
        count++;
    }

    @Override
    public void cook() {
        System.out.println("물에 면과 스프를 넣고 끓입니다.");
    }

    @Override
    public void serve() {
        System.out.println("라면을 손님에게 제공합니다.");
    }
}
