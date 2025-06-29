package week05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,8,1,3,9,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 숫자 : ");
        int n = sc.nextInt();
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, n);

        if(idx < 0){
            System.out.println("존재하지 않는 숫자입니다.");
        }else{
            System.out.println("존재하는 숫자입니다.");
        }
    }
}
