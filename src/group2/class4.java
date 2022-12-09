package group2;

import java.util.Arrays;

public class class4 {
    public static void main(String[] args) {
        int[][] array = {{1, 8, 4},
                         {7, 3, 2},
                         {5, 7, 3},
                        {2, 1, 0}};
        for (int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);}
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
        }System.out.println();
    }
}
