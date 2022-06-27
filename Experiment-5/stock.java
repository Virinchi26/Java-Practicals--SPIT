import java.util.Scanner;

class Details
{
        String name;
        int stock_prices [];
        
        public void input()
        {
                Scanner a = new Scanner(System.in);
                for (int i = 0; i < stock_prices.length; ++i)
                {
                        System.out.print("Enter Day " + (i + 1) + " Price: ");
                        stock_prices[i] = a.nextInt();
                }
        }
}

class Transaction extends Details
{
        public Transaction(int N)
        {
                stock_prices = new int[N];
                input();
        }
        
        public void MaxProfit()
        {
                int profit = 0;
                int local_min = 0;
                int local_max = 0;
                for (int i = 1; i < stock_prices.length - 1; ++i)
                {
                        if (stock_prices[i - 1] > stock_prices[i])
                        {
                                local_min = i;
                        }
                        if (stock_prices[i - 1] < stock_prices[i] && stock_prices[i] > stock_prices[i + 1])
                        {
                                local_max = i;
                                profit += stock_prices[local_max] - stock_prices[local_min];
                                System.out.println("Buy On Day " + (local_min + 1) + ", Sell On Day " + (local_max + 1));
                        }
                        if (i == stock_prices.length - 2)
                        {
                              if (stock_prices[stock_prices.length - 1] > stock_prices[local_min])
                                {
                                        System.out.println("Buy On Day " + (local_min + 1) + ", Sell On Day " + (stock_prices.length));
                                        profit += stock_prices[stock_prices.length - 1] - stock_prices[local_min];
                                }  
                        }
                }
                System.out.println("Profit: " + profit);
        }
}

public class stock
{
        public static void main(String [] args)
        {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Number Of Days: ");
                int temp_number = sc.nextInt();
                Transaction s1 = new Transaction(temp_number);
                s1.MaxProfit();
        }
}