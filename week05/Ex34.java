package week05;
/*
    삽입 정렬
 */
public class Ex34 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 1, 9, 7};
        System.out.println("정렬 전");
        for(int i = 0; i < arr.length; i++){
            System.out.println(String.format("x[%d] = %d", i, arr[i]));
        }

        insertSort(arr);

        System.out.println("정렬 후");
        for(int i = 0; i < arr.length; i++){
            System.out.println(String.format("x[%d] = %d", i, arr[i]));
        }
    }
    static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j;
            int tmp = arr[i];
            for(j = i; j > 0 && arr[j-1] > tmp; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = tmp;
        }
    }
}

