package group2;

public class class3 {
    public static void main(String[] args) {
        int[][] array = {{5, 2, 6, 7},
                         {5, 1, 7, 8},
                         {6, 8, 5, 5},
                         {4, 5, 6, 9}};
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println(" ");
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i][array.length -1 - i] + " ");
        }
        System.out.println(" ");
    }
}
