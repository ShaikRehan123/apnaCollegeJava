package Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] prices = {7,6,4,3,1};

        int max_profit = Integer.MIN_VALUE;

        for (int i = 0;i<prices.length;i++){
            for (int j = i+1;j<prices.length;j++){
                int sellingPrice = prices[j];
                int costPrice = prices[i];
                int profit  = sellingPrice - costPrice;
                if(max_profit < profit){
                    max_profit = profit;
                }
            }
        }

        if (max_profit < 0){
            System.out.println(0);
        } else{
            System.out.println(max_profit);
        }
    }
}
