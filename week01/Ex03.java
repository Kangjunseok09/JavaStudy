package week01;
/*
    연산자
 */
public class Ex03 {
    public static void main(String[] args) {
        int i = 1, j = 2;

        int a = i + j;
        int b = i - j;
        int c = i * j;
        int d = i / j;
        int e = i % j;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println(i++); // 출력 : 1 i == 2
        System.out.println(--j); // 출력 : 1 j == 1

        System.out.println(1&2); // 이진수 0001 & 0010 = 0000 출력 : 0
        System.out.println(1|2); // 이진수 0001 | 0010 = 0011 출력 : 3
    }
}
