package leetCode_Question;

// Contains Duplicate 2.

public class Q3 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 1, 3};
        Q3 obj = new Q3();
        System.out.println(obj.containsNearbyDuplicate(arr, 2));

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((j - i) > k) {
                    break;
                }
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
