package DSA.Arrays.Medium;

import java.util.Scanner;

public class TwoSumInputArrayIsSorted {
    public static int[] twoSum(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        while (left<right){
            int sum = (nums[left]+nums[right]);

            if (sum == target){
                return new int[]{left+1,right+1};
            }
            if (sum<target){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    static void main(String[] args) {
        System.out.println("Welcome to Two Sum Input Array is Sorted\n");
        Scanner x = new Scanner(System.in);
        System.out.println("The Given Array is: [0,1,2,3,4,5,6,7,8,9]");
        System.out.print("Choose the Target Element For Sum: ");
        int target = x.nextInt();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] twoSums = twoSum(nums,target);
        for (int two : twoSums) {
            System.out.print(two+ ",");
        }
    }
}
