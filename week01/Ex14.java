package week01;

import java.util.Arrays;

/*
    배열 복사, 정렬
 */
public class Ex14 {
    public static void main(String[] args) {
        // 배열 복사
        int arr1[] = new int[] {1, 2, 3};
        int arr2[] = new int[5];
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

        int arr3[] = new int[10];
        arr3 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr3));
        // 배열 정렬
        int arr4[] = new int[] {10, 3, 2, 9, 6, 8, 1};
        Arrays.sort(arr4); // 오름차순으로만 정렬됨
        System.out.println(Arrays.toString(arr4));
    }
}
