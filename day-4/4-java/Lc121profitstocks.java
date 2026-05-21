class solution{
    public int maxProfit(int[] prices){
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price : prices){
            if(price<minprice){
                minprice=price;
            }
            int profit=price-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}

public class Lc121profitstocks {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        solution s=new solution();
        System.out.println(s.maxProfit(prices));
    }
}
