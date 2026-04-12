package DSA.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrixElements {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                // left to right
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                // bottom to up
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }

    static void main(String[] args) {
        System.out.println("Welcome to Rotating Matrix:\n");
        Scanner x =  new Scanner(System.in);
        System.out.print("Enter the Size of Matrix: ");
        int n = x.nextInt();

        int[][] matrix = generateMatrix(n);
        for (int i=0;i<matrix.length;i++){
            System.out.print(Arrays.toString(matrix[i]) +" ");
        }
        System.out.println();
    }
}
