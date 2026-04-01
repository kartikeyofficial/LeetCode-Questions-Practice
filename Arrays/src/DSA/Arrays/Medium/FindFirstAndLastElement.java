package DSA.Arrays.Medium;

public class FindFirstAndLastElement {

        public static int[] searchRange(int[] nums, int target) {
            return new int[]{first(nums, target), last(nums, target)};
        }

        private static int first(int[] nums, int t) {
            int l = 0, r = nums.length - 1, res = -1;
            while (l <= r) {
                int m = (l + r) / 2;
                if (nums[m] >= t) r = m - 1;
                else l = m + 1;
                if (nums[m] == t) {
                    res = m;
                    System.out.print(res+",");
                };
            }
            return res;
        }

        private static int last(int[] nums, int t) {
            int l = 0, r = nums.length - 1, res = -1;
            while (l <= r) {
                int m = (l + r) / 2;
                if (nums[m] <= t) l = m + 1;
                else r = m - 1;
                if (nums[m] == t) {
                    res = m;
                    System.out.print(res);
                };
            }
            return res;
        }

    static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,1,2,7};
        int target = 2;
        searchRange(nums,target);


    }
}

