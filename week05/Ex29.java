package week05;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
    선형검색
 */
public class Ex29 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 숫자 : ");
        int n = sc.nextInt();
        int idx = SquenceSearch.search(arr, n);
        if(idx < 0) {
            System.out.println("존재하지 않는 숫자입니다.");
        }else {
            System.out.println(String.format("찾는 숫자 %d는 arr[%d]에 있습니다.", n, idx));
        }
    }
}

class SquenceSearch{
    static int search(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key) return i;
        }

        return -1;
    }
}