package group1;

import java.util.Arrays;
import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[][][] array = new int[][][]{
                {{222, 111}, {100, 99}, {88, 77}},
                {{60, 50}, {40, 30}, {20, 10}}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int c = 0; c < array[i][j].length; c++){
                    array[i][j][c]+=k;

                }
            }
        }System.out.print(Arrays.deepToString(array));
    }
}
