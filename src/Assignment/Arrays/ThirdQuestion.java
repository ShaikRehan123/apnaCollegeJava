package Assignment.Arrays;

public class ThirdQuestion {
    public int maxProfit(int[] prices) {
        int purchasePrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (purchasePrice < prices[i]) {
                maxProfit = Math.max(prices[i] - purchasePrice, maxProfit);
            } else {
                purchasePrice = prices[i];
            }
        }

        return maxProfit;
    }

}
