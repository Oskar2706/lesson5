package group2;

public class class2 {
    public static void main(String[] args) {
        int[][] array={{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                sum+=array[i][j];
            }
        }
        System.out.println(sum);
    }
}
