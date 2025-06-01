package week01;
/*
    배열
 */
public class Ex12 {
    public static void main(String[] args) {
        // 선언
        short[] sh;
        int i[];

        // 초기화
        //sh = {1, 2, 3};
        sh = new short[3];
        char[] ch = {'A', 'B', 'C'};
        System.out.println(ch.length);

        ch[0] = 'a';
        // ch[3] = 'D';  --> 배열 인덱스를 벗어남 오류

    }
}
