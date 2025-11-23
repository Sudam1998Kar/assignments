package assignments;

public class Assignment12_stock_market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//Input: prices = [7,1,5,3,6,4]
		
		int[]prices= {7,1,5,3,6,4};
		
		int maxProfit=0;
		int buyDay=0;
		int sellDay=0;
		
		//// Outer loop: pick each day as a potential buying day
		for(int i=0;i<prices.length-1;i++)
		{
			//// Inner loop: pick each subsequent day as a potential selling day
			for(int j=i+1;j<prices.length;j++)
			{
				 // Calculate the profit if we buy on day i and sell on day j
			    int profit= prices[j]-prices[i];
			    
			    if(profit>maxProfit)
			    {
			    	maxProfit=profit;
			    	buyDay=i+1;
			    	sellDay=j+1;
			    }
			}
		}
		
		// After checking all combinations, print the result based on whether profit is possible
        if (maxProfit > 0) {
            // If profit is positive, print the max profit and the days to buy/sell
            System.out.println(" maxProfit is " + maxProfit);
            System.out.println("Buy the share on day " + buyDay);
            System.out.println("Sell the share on day " + sellDay);
        } else {
            // If no profit is possible, warn the user
            System.out.println("You will lose your money, don't buy this share");
        }
	}
	
}
