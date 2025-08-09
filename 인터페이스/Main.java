package 인터페이스;

public class Main {
    public static void main(String[] args) {
        Cookable ramen = new Ramen();
        Cookable pizza = new Pizza();

        ramen.cook();
        ramen.serve();

        pizza.cook();
        pizza.serve();

        System.out.println("피자 개수 : " + Pizza.count);
        System.out.println("라면 개수 : " + Ramen.count);

    }
}
