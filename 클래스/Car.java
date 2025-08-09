package 클래스;

public class Car {

    String model;
    int speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }


    public void drive() {
        speed = 60; // 예시로 시속 60km로 달림
        System.out.println("시속 " + speed + "km로 달립니다.");
    }

    public void model() {
        System.out.println("현재 모델은 " + model + "입니다." );
    }

    public static void main(String[] args) {
        Car Car = new Car("Hyundai Avante");

        Car.drive();
        Car.model();
    }
}
