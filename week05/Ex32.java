package week05;

import java.util.Scanner;

/*
    버블정렬
 */
public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        System.out.println("버블 정렬 전");
        for(int i = 0; i < x.length; i++){
            System.out.println(String.format("x[%d] = %d", i, x[i]));
        }

        bubbleSort(x);

        System.out.println("버블 정렬 후");
        for(int i = 0; i < x.length; i++){
            System.out.println(String.format("x[%d] = %d", i, x[i]));
        }


    }
    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
