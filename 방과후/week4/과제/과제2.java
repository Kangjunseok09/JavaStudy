package 방과후.week4.과제;

public class 과제2 {
    public static void main(String[] args) {

        Movable[] vehicle =  new Movable[2];
        vehicle[0] = new Car();
        vehicle[1] = new Airplane();

        for (Movable i : vehicle){
            i.move();
        }

    }
}

interface Movable{
    public void move();

}

class Car implements Movable{
    public void move(){
        System.out.println("자동차가 도로를 달린다");
    }
}

class Airplane implements Movable{
    public void move(){
        System.out.println("비행기가 하늘을 난다");
    }
}

