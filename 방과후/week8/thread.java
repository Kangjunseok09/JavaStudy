package 방과후.week8;

public class thread {
    public static void main(String[] ar) {

    Thread t1 = new Thread(new t1());
    Thread t2 = new t2();

    t1.start();
    t2.start();

    }
}

class t1 implements Runnable {
    @Override
    public void run() {
        String[] strArray = new String[] {"하나","둘","셋","넷","다섯"};
        for (int i=0; i<strArray.length; i++) {
            System.out.println("(자막) "+ strArray[i]);
            try { Thread.sleep(200); } catch (InterruptedException e) { }
        }
    }
}

class t2 extends Thread {
    @Override
    public void run() {
        int[] intArray = new int[] {1,2,3,4,5};
        for (int i=0; i<intArray.length; i++) {
            System.out.println("(비디오 프레임) " + intArray[i]);
            try { Thread.sleep(200); } catch (InterruptedException e) { }
        }

    }
}