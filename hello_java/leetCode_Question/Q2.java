package leetCode_Question;

//Jump game leetcode Q55.

public class Q2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }

}
