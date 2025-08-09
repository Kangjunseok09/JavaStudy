package 추상클래스;

public abstract class Food {
    String name;

    public Food(String name){
        this.name = name;
    }

    public void serve(){
        System.out.println(name + "를 제공합니다.");
    }

    abstract void cook();

}

