import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4};
        String[] strArray = {"1", "2", "3", "4"};
        int[][] matrix = {{1, 2}, {10, 20}};
        int[][][] matrix2;

        int someValue = matrix[0][1];

        System.out.println(someValue);
        for (int[] table : matrix) {
            for (int value : table) {
                System.out.println(value);
            }

        }
        System.out.println(Arrays.toString(matrix));// ????wyświetli hashe

        for (int[] table:matrix){
            System.out.println(Arrays.toString(table));
        }
    }
}
