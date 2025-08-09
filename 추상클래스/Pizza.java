package 추상클래스;

public class Pizza extends Food {

    public Pizza() {
        super("피자");
    }
    @Override
    public void cook() {
        System.out.println("오븐에서 피자를 구웁니다.");
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.serve();
        pizza.cook();
    }
}
