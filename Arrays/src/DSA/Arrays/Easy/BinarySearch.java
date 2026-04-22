package DSA.Arrays.Easy;

import java.util.Scanner;

public class BinarySearch {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to the Binary Search array!\n ");
        System.out.print("Enter the Size of the Array: ");
        int size = x.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter the Array Element in Sorted Manner ("+(i+1)+"): ");
            nums[i] = x.nextInt();
        }
        System.out.print("Enter the Target Value: ");
        int target = x.nextInt();
        System.out.println("The Targeted Element is Present at Index: "+BinarySearchNumber(nums,target));
    }
    public static int BinarySearchNumber(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (target>nums[mid]){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return -1;
    }
}
