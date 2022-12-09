package group2;

public class class3 {
    public static void main(String[] args) {
        int[][] array = {{5, 2, 6},
                {5, 1, 7},
                {6, 8, 5}};
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }System.out.print(array[i][i] + " ");
        }
        System.out.println(" ");
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }System.out.print(array[i][array.length -1 - i] + " ");
        }
    }
}
