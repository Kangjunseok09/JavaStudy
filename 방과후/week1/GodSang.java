package 방과후.week1;

public class GodSang {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5}, {6}};
        for(int[] i : a){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
}
