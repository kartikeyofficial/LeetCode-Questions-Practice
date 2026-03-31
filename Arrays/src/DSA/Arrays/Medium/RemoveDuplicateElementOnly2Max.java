package DSA.Arrays.Medium;

public class RemoveDuplicateElementOnly2Max {
    public static int removeElement(int[] nums){
        int k=0;
        for (int i=0;i<nums.length;i++){
            if (k<2 || nums[i] != nums[k-2]){
                nums[k] = nums[i];
                System.out.print(nums[i]+",");
                k++;
            }

        }
        return k;
    }

    static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,2,2,3,3,3};
        removeElement(nums);

    }
}
