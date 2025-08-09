package 클래스;

public class SportsCar extends Car {

    boolean exhausted;

    public SportsCar(String model, boolean exhausted) {
        super(model);
        this.exhausted = exhausted;
    }

    public void exhaustsound() {
        if (exhausted) {
            System.out.println("배기음을 사용하고있습니다.");
        }else{
            System.out.println("배기음이 꺼져있습니다.");
        }
    }

    @Override
    public void drive() {
        this.speed = 200;
        System.out.println("시속 " + speed + "km로 달립니다.");
    }

    public static void main(String[] args) {
        SportsCar car = new SportsCar("Ferrari", true);
        car.model();
        car.drive();
        car.exhaustsound();
    }
}
