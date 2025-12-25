package leetCode_Question;

public class Q6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices)); // Output: 5
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Track lowest price so far
        int maxProfit = 0;                 // Track maximum profit

        for (int price : prices) {
            // Update minimum price if we find a lower one
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if sold today
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}