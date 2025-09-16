package 방과후.week5;

public class 예외처리 {
    public static void main(String[] args) {
        try{
            A.checkScore(-1);
        } catch (MinusException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}

class MinusException extends Exception {
    MinusException() {}
    MinusException(String s) {
        super(s);
    }
}

class A {
    static void checkScore(int score) throws MinusException {
        if(score < 0){
            throw new MinusException("예외: 음수값 출력");
        }else{
            System.out.println("정상적인 값입니다.");
        }
    }
}