package group2;

public class class1 {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array1 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int a = array.length;
        int b = array1[0].length;
        int c = array1.length;
        int[][] res = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    res[i][j] += array[i][k] * array1[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }
}
