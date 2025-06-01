package week01;
/*
    반복문 for(구구단)
 */
public class Ex06 {
    public static void main(String[] args) {
        // 세로형
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                // System.out.println(i + " X " + j + " = " + i*j);
                // System.out.print(i + " X " + j + " = " + i*j + "\n");
                System.out.printf("%d X %d = %02d\n", i, j, (i*j));

            }
            System.out.println("---------------");
        }

        // 가로형
        for(int i = 1; i <= 9; i++){
            for(int j = 2; j <= 9; j++){
                System.out.printf("%d X %d = %02d | ", j, i, (i*j));
            }
            System.out.println();
        }

    }
}
