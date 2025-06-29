package week05;

import java.util.Arrays;
import java.util.Scanner;

/*
    이진탐색
 */
public class Ex30 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,8,1,3,9,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 숫자 : ");
        int n = sc.nextInt();
        int idx = BinSearch.search(arr, n);
        if(idx < 0){
            System.out.println("존재하지 않는 숫자입니다.");
        }else{
            System.out.println("존재하는 숫자입니다.");
        }
    }
}

class BinSearch{
    static int search(int[] arr, int key){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        do {
            int center = (left + right) / 2;
            if(arr[center] == key) return center;
            if(arr[center] < key) left = center + 1;
            else right = center - 1;
        }while(left <= right);

        return -1;
    }
}