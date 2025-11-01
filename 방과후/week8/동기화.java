package 방과후.week8;

public class 동기화 {
    static int counter = 0;
    public static void main(String[] args) {


    Thread t1 = new Thread(new r1());

    Thread t2 = new Thread(new r2());

    t1.start();
    t2.start();

    try {
        // 두 스레드가 모두 끝날 때까지 대기
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("최종 counter 값: " + counter);
}
}

class r1 implements Runnable{
    public void  run(){
        for(int i=0; i< 1000000; i++) 동기화.counter++;
    }
}

class r2 implements Runnable{
    public void  run(){
        for(int i=0; i< 1000000; i++) 동기화.counter--;
    }
}
