package DSA.Arrays.Easy;

import java.util.Scanner;

public class SearchInsertedPosition {
    public static int searchInserted(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int mid = left+(right-left)/2;
            if (nums[mid]== target){
                return  mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return left;
    }

    static void main(String[] args) {
        System.out.println("Welcome to Search Inserted Value Position\n");
        int[] nums = {2,3,5,6,8,9};
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Target Element: ");
        int target = x.nextInt();
        System.out.println("Target Element for Inserting Right Position is: "+searchInserted(nums,target));
    }
}
