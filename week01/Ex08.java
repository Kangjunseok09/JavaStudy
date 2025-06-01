package week01;
/*
    이중 반복문
 */
public class Ex08 {
    public static void main(String[] args) {
        bb:
        while (true){
            for (int i = 1; i <= 100; i++) {
                if(i == 50){
                    break bb;
                }
                 System.out.println(i);
            }
        }
    }
}
