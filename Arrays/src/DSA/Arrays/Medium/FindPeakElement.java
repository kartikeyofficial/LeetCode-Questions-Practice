package DSA.Arrays.Medium;

import java.util.Scanner;

public class FindPeakElement {
    static void main(String[] args) {
        System.out.println("Welcome to Find Peak Element in the Array!\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array is: ");
        int size = x.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Element ("+(i+1)+") is: ");
            nums[i] = x.nextInt();
        }
        System.out.println("The peak Element Above the Array index is: "+peakElement(nums));

    }
    public static int peakElement(int[] nums){
        int left = 0;
        int right  = nums.length-1;
        while (left<right){
            int mid  = left+(right-left)/2;
            if (nums[mid]<nums[mid+1]){
                left = mid+1;
            }
            else {
                right = mid;
            }
        }
        return  left;
    }
}
