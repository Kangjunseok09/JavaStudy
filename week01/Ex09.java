package week01;
/*
    반복문 continue
 */
public class Ex09 {
    public static void main(String[] args) {
        bb:
        for(int i = 1; i < 100; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
