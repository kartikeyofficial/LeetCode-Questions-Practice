package DSA.Arrays.Medium;

import java.util.Scanner;

public class SearchIn2DMatrix {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Size of Length matrix: ");
        int row = x.nextInt();
        System.out.print("Enter the Size of Breadth matrix: ");
        int cols = x.nextInt();
        int[][] matrix = new int[row][cols];
        for (int i=0;i<row;i++){
            for (int j=0; j<cols;j++){
                System.out.print("Enter the Matrix Element ("+(i+1)+","+(j+1)+"): ");
                matrix[i][j] = x.nextInt();
            }
        }
        System.out.print("Enter the Element do You Find int The Matrix: ");
        int target = x.nextInt();

//        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(matrix,target));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length== 0){
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int cols = n-1;


        while(row < m && cols >= 0){
            if(matrix[row][cols] == target){
                return true;
            }
            else if(matrix[row][cols]> target){
                cols--;
            }
            else{
                row++;
            }
        }
        return false;


    }
}
