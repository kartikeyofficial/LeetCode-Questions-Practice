package DSA.Arrays.Medium;

import java.util.Scanner;

public class SearchInSortedRotatedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < mid) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= right) {
                    left = mid - 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Size Of The array: ");
        int size = x.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array Elements (" + (i + 1) + "): ");
            nums[i] = x.nextInt();
        }
        System.out.print("Enter The Element want to Search: ");
        int target = x.nextInt();
        System.out.println("Search Element index at: "+search(nums,target));
    }
}
