package week05;
/*
    선택 정렬
 */
public class Ex33 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 1, 9, 7};
        System.out.println("정렬 전");
        for(int i = 0; i < arr.length; i++){
            System.out.println(String.format("x[%d] = %d", i, arr[i]));
        }

        selectionSort(arr);

        System.out.println("정렬 후");
        for(int i = 0; i < arr.length; i++){
            System.out.println(String.format("x[%d] = %d", i, arr[i]));
        }
    }

    static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < arr.length; j++){
                // 최소값을 구합니다.
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            // 스와핑
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
